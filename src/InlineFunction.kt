/**
 *  인라인 함수 (inline function)
 *      - 함수가 호출되는 곳에 내용을 모두 복사해 넣어 함수의 분기 없이 처리 되기 때문에
 *      코드의 성능을 높일 수 있다.
 *      - 인라인 함수는 코드가 복사되어 들어가기 때문에 대개 내용은 짧게 작성한다.
 *      - 인라인 함수는 람다식 매개변수를 가지고 있는 함수 형태를 권장한다. (??)
 *          - 이유 생각해보기
 *              - 매개변수에 람다식이 있을 경우 컴파일 시 람다식에 대한 새로운 객체가 생성된다.
 *              - 이 객체를 함수를 사용할 때마다 새로 생성되기 때문에 낭비가 생긴다.
 *
 *      - 단점
 *          - 코드가 복사되므로 내용이 많은 함수에 사용하면 코드가 늘어난다.
 *
 *      - noinline : 인라인 함수의 제한
 *          - 일부 람다식 함수를 인라인 되지 않게 하기 위한 키워드
 *
 *      - crossinline : 비지역 반환의 금지
 *          -
 */

fun main() {
    shortFunc2(3) {
        "Inline $it"
        return              // 비지역 반환 이므로 "Goodbye" 실행 안됨
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Hello!!")
    println(out(a))
}

inline fun sub(a: Int, noinline out: (Int) -> Unit) {
    println("Hello!!")
    println(out(a))
}

inline fun shortFunc2(a: Int, out: (Int) -> Unit) {
    println("Hello!!")
    println(out(a))
    println("Goodbye")
}