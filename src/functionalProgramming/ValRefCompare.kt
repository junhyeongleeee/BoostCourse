package functionalProgramming

/**
 *  기본형과 참조형 변수에 대한 비교
 *      - 코틀린은 기본적으로 참조형으로 변수를 표현한다.
 *      - 컴파일시 최적화를 통해 기본형을 판단한다.
 *      - 기본형 :
 *          - stack 에 변수의 값을 저장한다.
 *      - 참조형 :
 *          - stack 에 변수의 주소를 저장한다.
 *          - heap 에 변수의 주소(위치)에 변수의 값을 저장한다.
 *          - Nullable 한 변수는 참조형 객체로 판단.
 *
 *      - 코틀린에서는 참조형으로 선언한 변수의 값이 -128 ~ 127 범위에 있으면 캐시에 그 값을 저장한다.
 *        이와 같은 경우는 앞에 정리한 참조형 저장 방식과 다르기 때문에 삼중 등호 비교 시 Nullable
 *        한 변수끼리도 같은 주소값이 나온다.
 */

fun main() {

    val a: Int = 128        // 참조형으로 표현하지만 컴파일시 기본형으로 판단함.
    val b = a

    val c: Int? = a         // a에 대한 값을 heap 메모리에 할당하고 a에 대한 주소는 stack 에 저장한다.
    val d: Int? = a         // c와 동일하지만 heap 메모리에 새로운 주소를 할당한다.
    val e: Int? = c         // c의 주소값을 e에게 할당한다. => stack

    println(c == d)         // a에 대한 값이 저장되므로 true
    println(c === d)        // 참조형 변수들이기 때문에 주소값이 다름.
    println(c === e)        // c를 할당 받았기 때문에 주소값이 같다.
}