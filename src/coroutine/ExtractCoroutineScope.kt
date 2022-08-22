package coroutine

import kotlinx.coroutines.*


/**
 *  만약 중단 함수가 현재 스코프에서 수행 될 코루틴 빌더를 포함한다면 ?
 *      - CoroutineScope 의 확장 함수로 만든다.
 *          > API 를 불명확하게 한다.???...
 *      - CoroutineScope(coroutineContext) 자체를 생성한다.
 *          > 구조적으로 안전하지 않다. > ????..
 *
 */

fun main() = runBlocking {
    launch {
        doWorld()
    }
    println("Hello,")
}

suspend fun doWorld() {
    delay(1000L)
    println("World!")
}