package standardLibrary

/**
 *  run() : 그냥 실행하고 결과를 반환
 *      - 인자가 없는 익명 함수처럼 동작하는 형태와
 *      객체에서 호출하는 형태 두 가지로 사용
 *          public inline fun <R> run (block: () -> R): R = return block()
 *          public inline fun <T, R> T.run(block: T.() -> R): R = return block()
 *
 */

fun main() {

    var skills = "Kotlin"
    println(skills)

    val a = 10
    skills = run {
        val level = "Kotlin Level: $a"
        level
    }
    println(skills)


    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")

    // 여기서 this 는 person 객체를 가리킴
    person.apply { this.skills = "Swift" }
    println(person)

    val returnObj = person.apply {
        name = "Sean"
        skills = "Java"
        "success"       // 사용되지 않음음
    }
    println(person)
    println(returnObj)

    val returnObj2 = person.run {
        name = "Dooly"
        skills = "C#"
        "success"
    }
    println(person)
    println(returnObj2)
}