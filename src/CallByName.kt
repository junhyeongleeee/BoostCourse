/**
 *  CallByName 작동 순서
 *      1. callByName 호출
 *      2. Lambda() 람다식 이름을 호출
 *      3. 람다식 자체가 매개변수로 들어감
 *      4. callByValue(Lambda()) 실행
 *      5. b() 실행 시 otherLambda 실행
 */

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean{
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}