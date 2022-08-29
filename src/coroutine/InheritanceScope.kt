package coroutine

import kotlinx.coroutines.*

fun main() = runBlocking{
    println("runBlocking: $coroutineContext")
    val request = launch {
        println("request: $coroutineContext")
        // 프로그램 전역으로 독립적인 수행 (부모-자식 관계 없음)
        GlobalScope.launch {
            println("job1: before suspend function, $coroutineContext")
            delay(1000)
            // 작업 취소에 영향을 받지 않음.
            println("job1: after suspend function, $coroutineContext")
        }

        // 부모의 문맥을 상속 (상위 launch 의 자식)
        launch {
        // 부모의 문맥을 상속 (상위 launch 의 자식), 분리된 작업
//        launch(Dispatchers.Default) { }
        // 새로운 스코프가 구성되 request 와 무관, request 가 최소 되도 계속 실행된다.
//        CoroutineScope(Dispatchers.Default).launch {  }
            delay(100)
            println("job2: before suspend function, $coroutineContext")
            delay(1000)
            println("job2: after suspend function, $coroutineContext")
        }
    }
    delay(500)
    request.cancel()
    delay(1000)
}