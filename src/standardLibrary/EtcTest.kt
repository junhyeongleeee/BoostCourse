package standardLibrary

import java.util.Objects
import kotlin.random.Random
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

/**
 *  takeIf() : 람다식이 true 이면 객체 T를 반환하고 그렇지 않은 경우 null 반환
 *      <=> takeUnless() 반대
 *      public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T?
 *          = if (predicate(this)) this else null
 *
 *  measureTimeMillis() , measureTimeNanoTime() : kotlin.system 패키지에 있는 측정(시간) 함수
 *
 *  Random : 코틀린에서는 멀티플랫폼에서도 사용 가능한 kotlin.random.Random 제공
 *
 */

fun main() {
    data class SomeObject(val status: Boolean)

    val someObject : SomeObject? = SomeObject(true)
    if (someObject != null && someObject.status) {
        doThis()
    }
    if (someObject?.status == true) {
        doThis()
    }
    someObject?.takeIf { it.status }.apply { doThis() }

    // 엘비스 연산자 함께 사용
    val input = "Kotlin"
    val keyword = "in"

    // 입력 문자열에 키워드가 있으면 인덱스를 반환하는 함수를 takeIf를 사용하여 구현
    input.indexOf(keyword).takeIf { it >= 0 } ?: error("keyword not found")

    // takeUnless를 사용하여 구현
    input.indexOf(keyword).takeUnless { it < 0 } ?: error("keyword not found")


    ///////////////////////////////////////////
    // 시간 측정 코드
    val excutionTime = measureTimeMillis {
        // 측정할 코드
    }
    println("Excution Time = $excutionTime ms")

    ///////////////////////////////////////////
    // 코틀린 난수 생성

    val number = Random.nextInt(21)     // 숫자는 난수 발생 범위
    println(number)

}

fun doThis(): Unit {}