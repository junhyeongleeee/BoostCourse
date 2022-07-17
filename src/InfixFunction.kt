/**
 *  중위 함수 (infix function)
 *      - infix 로 선언할 시 중위 함수
 *      - 연산자를 구현할 수 있는 함수를 말한다.
 *      - 비트 연산자에서 많이 사용된다.
 */


fun main() {
    // 일반 표현법
//    val multi = 3.multiply(10)

    // 중위 표현법
    val mutlti = 3 multiply 10
    println(mutlti)
}

infix fun Int.multiply(x: Int): Int {
    return this*x
}