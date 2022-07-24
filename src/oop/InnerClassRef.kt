package oop

open class Base {
    open val x: Int = 1
    open fun f() = println("Base Class f()")
}

class Child: Base() {
    override val x: Int = super.x + 1
    override fun f() = println("Child Class f()")

    inner class Inside {
        fun f() = println("Inside Class f()")
        fun test() {
            f()                     // 현재 이너 클래스의 f()
            Child().f()             // 바로 바깥 클래스 f()
            super@Child.f()         // Child 의 상위 클래스인 Base 클래스의 f()
            println("[Inside] super@Child.x: ${super@Child.x}") // Base 의 x 접근
        }
    }
}

fun main() {
    val c1 = Child()
    c1.Inside().test()
}