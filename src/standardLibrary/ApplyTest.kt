package standardLibrary

import java.io.File

/**
 *  apply() : 널 확장시켜 놓고 난 반환한다.
 *      - also()함수와 마찬가지로 호출하는 객체 T를 이어지는 block 으로 전달하고
 *      객체 자체인 this를 반환
 *          let - public inline fun <T, R> T.let(block: (T) -> R): R { ... return block(this) }
 *          also - public inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }
 *          *apply - public inline fun <T> T.apply(block: T.() -> Unit): T { block(); return this }
 *
 *      - T.() 와 같은 표현에서 람다식이 확장 함수로서 처리
 *
 */

fun main() {

    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    // 여기서 this 는 person 객체를 가리킴
    person.apply { this.skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name = "Sean"           // this 는 생략할 수 있음
        skills = "Java"         // this 없이 객체의 맴버에 여러 번 접근
    }
    println(person)
    println(returnObj)

    // 디렉터리 생성 시
    fun makeDir(path: String) = File(path).apply { mkdirs() }
}