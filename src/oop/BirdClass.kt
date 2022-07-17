package oop

/**
 *
 *
 */

class Bird(var name: String, val wing: Int, var beak: String) {

    init {
        // 객체가 생성될 때 추가적으로 작동 시키고 싶은 코드를 넣는다.
    }

    fun fly(){
        println("Fly")
    }
}

fun main() {
    val coco = Bird("coco", 2, "long")
    coco.fly()
}