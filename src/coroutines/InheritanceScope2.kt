package coroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            for (i in 1..2) {
                /*launch {
                    work(i)
                }*/
                launch(Dispatchers.Default) {
                    work(i)
                }
                /*GlobalScope.launch {
                    work(i)
                }*/
            }
        }
    }
    println("Done in $time ms")
}

fun work(i: Int) {
    Thread.sleep(1000)
    println("work $i done")
}
