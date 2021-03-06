package functionalProgramming

/**
 *  순수 함수 (Pure Function)
 *      - 부작용 (side - effect) 이 없는 함수
 *          - 동일한 입력 인자에 대해서는 항상 같은 결과를 출력 혹은 반환 한다.
 *          - 값이 예측이 가능해 결정적 (deterministic) 이다.
 *      - 함수 외부의 어떤 상태도 바꾸지 않는다.
 *      - 장점
 *          - 입력과 내용을 분리하고 모듈화 하므로 재사용성이 높아진다.
 *          - 특정 상태에 영향을 주지 않으므로 병행 작업 시 안전한다.
 *          - 함수의 값을 추적하고 예측 할 수 있기 때문에 테스트, 디버깅 등이 유리하다.
 *      - 함수형 프로그래밍에 적용
 *          - 함수를 매개변수, 인자에 혹은 반환값에 적용 (고차 함수)
 *          - 함수를 변수나 데이터 구조에 저장
 *          - 유연성 증가
 *
 *  람다식 (functionalProgramming.getLambda Expression)
 *      - 익명 함수의 하나의 형태로 이름 없이 사용 및 실행이 가능
 *      - 람다식은 고차 함수에서 인자로 넘기거나 결과값으로 반환 등을 할 수 있다.
 *
 *  일급 객체 (First Class Citizen)
 *      - 함수의 인자로 전달할 수 있다.
 *      - 함수의 반환값에 사용할 수 있다.
 *      - 변수에 담을 수 있다.
 *      * 코틀린에서 함수는 1급 객체로 다룬다.
 *
 *
 *
 *  함수형 프로그래밍 Why????
 *      - 프로그램을 '모듈화' 해 디버깅하거나 테스트가 쉬움
 *      - 간략한 표현식을 사용해 생산성이 높으
 *      - 람다식과 고차함수를 사용하면서 다양한 함수 조합을 사용할 수 있음
 *
 *      **정리
 *          - 함수형 프로그래밍은 순수 함수를 조합해 상태 데이터 변경이나 부작용이 없는
 *          루틴을 만들어 내며 이름 없는 함수 형태의 하나인 람다식을 이요해 함수를 변수처럼
 *          매개변수, 인자, 반환값 등에 활용하는 고차 함수를 구성해 생산성을 높인 프로그래밍 방법법
 */
fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}

fun highFunc2(a: Int, b: Int, sum: (Int, Int) -> Int): Int {
    return sum(a, b)
}

fun main() {

    var sum: Int = highFunc({ x, y -> x + y }, 1, 2)

    sum = highFunc2(1, 2) { x, y -> x + y }

    println(sum)
}