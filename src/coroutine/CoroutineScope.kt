package coroutine

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/**
 *  runBlocking
 *      - 주어진 블록이 완료 될 때까지 현재 스레드를 멈추는 새로운 코루틴 빌더
 *      - 코루틴 안에서 사용은 권장되지 않는다.
 *      - 일반적인 함수 코드 블록에서 중단 함수를 호출할 수 있도록 하기 위해
 *      존재하는 장치.
 *
 *  coroutineScope
 *      - 모든 자식 코룰틴들이 끝날 때까지 종료되지 않는 코루틴 빌더
 *
 *
 *  runBlocking vs coroutineScope
 *      - coroutineScope 는 자식들의 종료를 기다리는 동안 현재 스레드를 블록하지 않는다.
 *
 */

fun main() = runBlocking {

    val time = measureTimeMillis {

        launch {
            delay(200L)
            println("Task from runBlocking")
        }

        coroutineScope {
            launch {
                delay(500L)
                println("Task from nested launch")
            }
            delay(100L)
            println("Task from coroutine scope")
        }
    }

    println("Coroutine scope is over, $time")
}