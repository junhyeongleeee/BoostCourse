package functionalProgramming

/**
 *  확장 함수 (Extension Function)
 *      - 기존의 표준 라이브러리를 수정하지 않고도 확장 할 수 있다.
 */

fun main() {

    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))

}

fun String.getLongString(target: String): String =
    if (this.length > target.length) this else target