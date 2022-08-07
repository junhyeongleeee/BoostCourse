package coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    launch {
        delay(100L)
        println("Task from runBlocking")
    }

    // CoroutineScope Block 과 상관 없이 RunBlocking 실행
    coroutineScope {
        launch {
            delay(200L)
            println("Task from nested launch")
        }
        delay(200L)
        println("Task from coroutineScope")
    }

    println("end of runBlocking")
}