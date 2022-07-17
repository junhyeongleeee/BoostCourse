package standardLibrary


/**
 *  let() : 너 할일은 결과와 함께 반환해. 알았지?
 *      - 함수를 호출하는 객체 T를 이어지는 block 의 인자로 넘기고 block 의 결과값 R을 반환
 *          public inline fun <T, R> T.let(block: (T) -> R): R { ... return block(this) }
 *      - 매개변수 block 은 T를 매개변수로 받아 R을 반환
 *      - let() 함수 역시 R을 반환
 *      - 본문의 this 는 객체 T를 가리키는데 람다식 결과 부분을 그대로 반환한다는 뜻
 *      - 다른 메서드를 실행하거나 연산을 수행해야 하는 경우 사용
 *
 *      - 체이닝 (chaining)
 *      - 중첩
 *      - null 검사
 */

fun main() {
    val score: Int? = 32
    //var score = null

    // 일반적인 null 검사
    fun checkScore() {
        if(score != null){
            println("Score: $score")
        }
    }

    // let 을 사용해 null 검사를 제거
    fun checkScoreLet(){
        score?.let { println("Score: $it") }
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()


    // let 함수의 체이닝(chaining)
    var a = 1
    val b = 2
    a = a.let { it + 2 }.let {
        println("a = $a")       // a = 1
        val i = it + b          // it = 3
        i
    }
    println(a)

    // 중첩 사용
    var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer")
            "Inner String"      // 이것은 반환 되지 않음
        }
        "Outer String"          // 이 문자열이 반환되 x에 할당
    }

    // null 검사

    // else 문이 포함된 문장 대체
    val firstName: String? = "hi"
    var lastName: String = ""

    firstName?.let { println("$it $lastName") } ?: print("$lastName")
}