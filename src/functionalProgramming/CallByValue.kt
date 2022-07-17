package functionalProgramming

/**
 *  CallByValue 작동 순서
 *      1. functionalProgramming.callByValue 호출
 *      2. functionalProgramming.getLambda() 값을 호출
 *      3. functionalProgramming.getLambda() 의 결과를 반환
 *      4. 반환된 값을 매개변수로 복사
 *      5. functionalProgramming.callByValue(functionalProgramming.getLambda()) 실행
 */

fun main() {
    val result = callByValue(Lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean{
    println("functionalProgramming.callByValue function")
    return b
}

val Lambda: () -> Boolean = {
    println("lambda function")
    true
}