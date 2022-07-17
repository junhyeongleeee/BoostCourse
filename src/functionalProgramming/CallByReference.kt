package functionalProgramming

/**
 *  참조에 의한 호출
 *      - 다른 함수에 의한 호출
 *          - 매개변수의 람다식과 일치한 경우 ::를 사용(참조)하여 함수이름으로 불러올 수 있음
 */

fun main() {
    println(funcParam(1, 2, ::sum))
}

fun sum(x: Int, y: Int) = x + y

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}