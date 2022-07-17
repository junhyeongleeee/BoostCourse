package functionalProgramming

/**
 *  클로저 (Closer)
 *      - 람다식으로 표현된 내부 함수에서 외부 범위에 선언된 변수에 접근할 수 있는 개념
 *      - 람다식 안에 있는 외부 변수는 값을 유지하기 위해 람다가 포획(capture)한 변수
 */

fun main() {

    val calc = Calc()
    var result = 0
    calc.addNum(2, 3) { x, y -> result = x + y }
    println(result)

    filteredNames(3)

}

fun filteredNames (length: Int) {
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter {
        it.length == length
    }
    println(filterResult)
}

class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {
        add(a, b)
    }
}