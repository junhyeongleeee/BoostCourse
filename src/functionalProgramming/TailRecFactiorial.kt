package functionalProgramming

/**
 *  꼬리 재귀 (tail recursive function)
 *      - 스택을 사용하지 않음 -> 스택 오버플로우 방지
 *      - 같은 함수를 덮어씌우는 식으로 컴파일 됨
 */

fun main() {
    val number = 5
    val result: Long

    result = normalFactorial(number)
    println("NormalFactorial: $number -> $result")

    println("Factorial: $number -> ${factorial(number)}")
}

fun normalFactorial(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial(n - 1)
}

tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n - 1, run * n)
}