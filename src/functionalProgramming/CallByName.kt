package functionalProgramming

/**
 *  CallByName 작동 순서
 *      1. functionalProgramming.callByName 호출
 *      2. functionalProgramming.getLambda() 람다식 이름을 호출
 *      3. 람다식 자체가 매개변수로 들어감
 *      4. functionalProgramming.callByValue(functionalProgramming.getLambda()) 실행
 *      5. b() 실행 시 functionalProgramming.getOtherLambda 실행
 */

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean{
    println("functionalProgramming.callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("functionalProgramming.getOtherLambda function")
    true
}