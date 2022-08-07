package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

fun main() {
    val job = GlobalScope.launch {
        delay(1000)
        doSomething()
        print("World!!")
    }
    println("job: $job")
    println("HelloWorld")
    Thread.sleep(2000)
    println("job: ${job.isCompleted}")
}


suspend fun doSomething() {
    println("doSomething")
}