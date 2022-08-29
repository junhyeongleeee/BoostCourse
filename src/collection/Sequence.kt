import kotlin.system.measureTimeMillis

fun main() {
    val list = (0..10000).toList()


    val time = measureTimeMillis {
        list.map { it + 1 }
            .filter { it > 3 }
    }
    println(time)

    val time2 = measureTimeMillis {
        list.asSequence()
            .map { it + 1 }
            .filter { it > 3 }
            .toList()
    }

    
    println(time2)
}