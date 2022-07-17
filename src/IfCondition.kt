/**
 *  조건식의 표현식
 *      - 블록과 함께 사용하는 경우
 *          - 마지막 식이 반환된다. (return 사용 x)
 *
 *      - 범위 (range) 연산자
 *          - 변수명 in 시작값...마지막 값 ex) score in 80..89
 *
 *
 */

fun main() {
    val a = 12
    val b = 7

    val max = if (a > b) {
        println("a 선택")
        a
    } else {
        println("b 선택")
        b
    }
    println(max)


    val score = readLine()!!.toDouble()
    var grade = 'F'

    if(score >= 90.0){
        grade = 'A'
    } else if (score in 80.0..89.9){
        grade = 'B'
    } else if (score in 70.0..79.9){
        grade = 'C'
    }

    println("score: $score, grade: $grade")

}