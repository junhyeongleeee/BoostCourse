package functionalProgramming

fun main() {
    var total = 0
    for(num in 1..100 step 2){
        total += num
    }
    
    for(num in 0 until 10){
        total -= num
    }

    println("total : $total")
}