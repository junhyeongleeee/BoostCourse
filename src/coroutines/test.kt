package coroutines

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(){
    val time = measureTimeMillis {
        runBlocking {
            launch { work(1) }
            launch { work(1) }
        }
    }
    println("Done time: $time")
}