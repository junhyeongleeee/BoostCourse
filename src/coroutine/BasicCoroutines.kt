package coroutine

import kotlinx.coroutines.*


/**
 *
 *  launch 의 원형
 *      public fun launch {
 *          context: CoroutineContext,
 *          start: CoroutineStart,
 *          parent: Job?,
 *          onCompletion: CompletionHandler?,
 *          block: suspend CoroutineScope.() -> Unit): Job {
 *          ...
 *      }
 *
 *      CoroutineStart
 *          - DEFAULT: 즉시 시작 (해당 문맥에 따라 즉시 스케줄링 됨)
 *          - LAZY: 코루틴을 느리게 시작 (처음에는 중단 상태이며 START() AWAIT() 등으로 시작)
 *          - ATOMIC: (시작을 보장) 원자적으로 즉시 시작(DEFAULT 와 비슷하나 코루틴을 실행전에는 취소)
 *          - UN DISPATCHED: 현재 스레드에서 즉시 시작 (첫 지연함수까지, 이후 재개시 다시 시작됨)
 *
 *
 *  runBlocking
 *      fun <T> runBlocking {
 *          context: CoroutineContext = EmptyCoroutineContext,
 *          block: suspend CoroutineScope.() -> T
 *          ): T (source)
 *
 *  withContext
 *      suspend fun <T> withContext (
 *          context: CoroutineContext,
 *          block: suspend CoroutineScope.() -> T
 *      ): T (source)
 *
 *      - 완료 보장 withContext(NonCancellable) {...}
 *
 *  coroutineScope
 *      suspend fun <R> coroutineScope(
 *          block: suspend CoroutineScope.() -> R
 *      ): R (source)
 *
 *      - supervisorScope
 *
 *  supervisorScope
 *      fun SupervisorJob(parent: Job? = null): CompletableJob (source)
 *
 *  Parallel Decomposition
 *      suspend fun loadAndCombine(name1: String, name2: String): Image {
 *          // coroutineScope { } 으로 감싸서 에러 처리
 *          val deferred1 = async( loadImage(name1) }
 *          val deferred2 = async( loadImage(name2) }
 *          return combineImages(deferred1.await(), deferred2.await())
 */

fun main() = runBlocking {
    /*val job = GlobalScope.launch {
        delay(1000)
        doSomething()
        print("World!!")
    }
    println("job: $job")
    println("HelloWorld")
//    Thread.sleep(2000)
    println("job: ${job.isCompleted}")*/


    val job = worksInParallel()
    job.join()
    println("end of Blocking")
}

fun worksInParallel(): Job {
    val scope = CoroutineScope(Dispatchers.Default)

    val one = scope.launch {
        print("coroutine1")
    }

    val two = scope.launch {
        print("coroutine2")
    }

    val job = scope.launch {
        one.join()
        two.join()
    }
    return job
}

suspend fun print(name: String) {
    var idx = 0
    while (true) {
        delay(1000L)
        println("$name: ${idx++}")
    }
}

suspend fun doSomething() {
    println("doSomething")
}