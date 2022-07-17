package standardLibrary

import java.io.File

/**
 *  also() : 너 할일해. 난 그냥 반환할께.!
 *      - 함수를 호출하는 객체 T를 이어지는 block 에 전달하고 객체 T 자체를 반환
 *           let - public inline fun <T, R> T.let(block: (T) -> R): R { ... return block(this) }
 *           also - public inline fun <T> T.also(block: (T) -> Unit): T { block(this); return this }
 *
 *      -
 */

fun main() {


    var m = 1
    m = m.also { it + 3 }
    println(m) // 원본 값 1


    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    val a = person.let {
        it.skills = "Android"
        "success"
    }

    println(person)
    println("a: $a")

    val b = person.also {
        it.skills = "Android"
        "success"
    }

    println(person)
    println("b: $b")


    // 디렉터리 생성 활용

    // 기존의 디렉터리 생성 함수
    fun origin_makeDir(path: String): File{
        val result = File(path)
        result.mkdirs()
        return result
    }
    // let 과 also 를 통한 개선된 함수
    fun makeDir(path: String) = path.let { File(it) }.also { it.mkdirs() }
}