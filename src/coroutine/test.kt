package coroutine

import kotlinx.coroutines.*

fun main(){
    runBlockingTest()
}

fun runBlockingTest() =  runBlocking {
    println("runBlocking parent ${this.coroutineContext}")

    coroutineScope {
        println("coroutineScope ${this.coroutineContext}")
    }

    CoroutineScope(Dispatchers.Default).launch {
        println("CoroutineScope ${this.coroutineContext}")
        runBlocking(Dispatchers.Default) { println("CoroutineScope child[runBlocking Dispatchers] ${this.coroutineContext}") }
        runBlocking {
            println("CoroutineScope child[runBlocking] ${this.coroutineContext}")
        }
        launch { println("CoroutineScope child[launch] ${this.coroutineContext}")  }.join()
    }

    launch {
        println("launch ${this.coroutineContext}")
    }.join()

    async { println("async ${this.coroutineContext}") }.await()

    withContext(Dispatchers.IO) { println("withContext ${this.coroutineContext}") }

    runBlocking { println("runBlocking child ${this.coroutineContext}") }


}