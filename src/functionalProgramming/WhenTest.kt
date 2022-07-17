package functionalProgramming

fun main() {
    val a = 12
    val b = 7

    val max = if (a > b) {
        println("a 선택")
        a
    } else {
        println("b 선택")
        b
    }
    println(max)


    val score = readLine()!!.toDouble()
    var grade = 'F'

    grade = when(score){
        in 90.0..100.0 -> 'A'
        in 80.0..89.0 -> 'B'
        in 70.0..79.9 -> 'C'
        else -> 'F'
    }

    println("score: $score, grade: $grade")

}