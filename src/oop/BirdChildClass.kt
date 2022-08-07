package oop

/**
 *  상속 (Inheritance)
 *      - 파생 클래스
 *          open class [기반 클래스 명] {...}
 *              - 묵시적으로 Any 로 부터 상속됨
 *          class [파생 클래스 명]: 기반 클래스명() {...}
 *              - 기반 클래스로부터 상속됨. 최종 클래스로 파생 불가
 *              - 하위 클래스는 상위 클래스의 매서드나 프로퍼티를 그대로 상속하면서
 *              상위 클래스에는 없는 자신만의 프로퍼티나 메서드를 확장할 수 있다.
 *
 *
 *   다형성 (Polymorphism)
 *      - 같은 이름을 사용하지만 구현 내용이 다르거나 매개변수가 달라서 하나의
 *      이름으로 다양한 기능을 구행할 수 있는 개념
 *
 *      - Static Poly..
 *          - 컴파일 타임에 결정되는 다형성
 *          - 메서드 오버로딩 (Overloading)을 사용할 때
 *              Overloading
 *                  - 기능은 같지만 인자를 다르게 하여 여러 경우를 처리
 *      - Dynamic Poly..
 *          - 런타임 다형성
 *          - 동적으로 구성되는 오버라이딩(Overriding)된 메서드를 사용할 때
 *              Overriding
 *                  - 기능을 완전히 다르게 바꾸어 재설계
 *
 */

// 여기서 open 은 상속 기능
open class Bird(
    var name: String,
    var wind: Int,
    var beak: String
) {
    /*fun fly() {
        println("Fly")
    }*/

    // 하위 클래스에서 오버라이딩 가능
    open fun fly() {
        println("Fly")
    }
}

class Lark(
    name: String,
    wing: Int,
    beak: String
) : Bird(name, wing, beak) {

    override fun fly() {
        println("Lark : Fly")
    }

    fun singHiTone() {
        println("sing HiTone")
    }
}

class Parrot : Bird {
    var language: String

    constructor(
        name: String,
        wing: Int,
        beak: String,
        language: String
    ) : super(name, wing, beak) {
        this.language = language
    }

    // 재정의
    override fun fly() {
        super.fly()             // 상위 클래스의 fly()을 먼저 수행
        println("Parrot : Fly")
    }

    fun speak() {
        println("Speak: $language")
    }
}