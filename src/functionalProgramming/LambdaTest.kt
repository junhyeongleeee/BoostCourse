package functionalProgramming

/**
 *  람다식의 구성
 *      - 변수에 지정된 람다식
 *      - val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y }
 *                  [ 람다식의 선언 자료형]  [람다식 매개변수]   [람다식 처리 내용]
 *          - 변수를 함수 처럼 사용 가능
 *          - 선언 자료형이 명시 되어 있으면 매개변수 자료형 생략 가능
 *          - 매개변수 자료형이 명시 되어 있으면 선언 자료형 생략 가능
 */


fun main() {
    val result: Int

//    val multi = { a: Int, b: Int -> a * b }

    val multi: (a: Int, b: Int) -> Int = { a, b ->
//        println("a: $a b: $b")
        a * b
    }

    // 반환 자료형이 없거나 매개변수가 하나 있을 때
    val greet: () -> Unit = { println("Hello World!!") }
    val ab_greet = { println("HelloWorld!!") }
    val square: (Int) -> Int = { x -> x * x }
    val ab_square = { x: Int -> x * x }


    // 람다식 안에 람다
    val nestedLambda: () -> () -> Unit = { { println("nested") } }
    val ab_nestedLambda = { { println("nested") } }

    result = multi(10, 20)
    println(result)
}