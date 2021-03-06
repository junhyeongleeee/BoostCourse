package functionalProgramming

/**
 *  2의 보수
 *
 */

fun main() {

    val a = 0b011       // 3 (10)
    val b = a.inv()     // a의 1의 보수 11...1100 (반전)

    // 11....100 음수 계산 -> -1 하기 11...1011 -> 반전 00....100
    println("a : $a b : $b")
}