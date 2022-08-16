package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {

    // runBlocking 에 대한 Coroutine Context 상속
    launch {

    }

    /**
     *  새로운 Scope 정의
     *   - 문맥에 대한 정의가 없다.
     *   - 상위 Block 에 대한 스코프로써 반환해준다.
     *   coroutineScope(block: suspend kotlinx.coroutines.CoroutineScope.() -> R): R
     *      { contract { /* compiled contract */ }; /* compiled code */ }
     */
    coroutineScope {

        // 새로 만들어진 scope 에 대한 문맥 상속
        launch {

        }
    }

    println()
}