package standardLibrary

/**
 *  with() : 난 단독으로 실행되 반환하는 녀석이지
 *      - 인자로 받는 객체를 이어지는 block 의 receiver 로 전달하며 결과값을 반환
 *      - run() 함수와 기능이 거의 동일한데, run 의 경우 receiver 가 없지만 with()
 *      에서는 receiver 로 전달할 객체를 처리
 *          public inline fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
 *
 *      - 세이프 콜은 지원하지 않기 때문에 다음과 같이 let 과 같이 사용
 *
 */

fun main() {
    data class User(var name: String, var skills: String, var email: String? = null)
    val user = User("Kildong", "default")

    val result = with (user) {
        skills = "Kotlin"
        email = "kildong@example.com"
    }

    println(user)
    println("result: $result")
}