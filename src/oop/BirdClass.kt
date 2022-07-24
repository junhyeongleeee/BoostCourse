package oop

/**
 *  클래스 (Class)
 *      - 분류, 계층, 등급 등의 우리말 뜻
 *      - 특정 대상을 분류하고 특징(속성)과 동작 활동(함수) 내용을 기록
 *  추상화 (Abstraction)
 *      - 목표로 하는 것에 대해 필요한 만큼 속성과 동작을 정의하는 과정
 *  프로퍼티 (Property)
 *      - 속성 (Attribute) , 변수 (Variable), **필드 (Field)**, 데이터 (Data)
 *  매서드 (Method)
 *      - **함수 (Function)** , 동작 (Operation) , 행동 (Behavior)
 *  객체 (Object)
 *      - 인스턴스 (Instance)
 *
 */

/*class Bird(var name: String, val wing: Int, var beak: String) {

    // 필드
    *//*var name: String
    var wing: Int
    var beak: String*//*

    // 부 생성자
    *//*constructor(_name: String, _wing: Int, _beak: String) {
        name = _name
        wing = _wing
        beak = _beak
    }*//*

    *//*init {
        // 객체가 생성될 때 추가적으로 작동 시키고 싶은 코드를 넣는다.
//        println(" ------------- init start ------------- ")
    }
*//*
    // 매서드
    fun fly(){
        println("Fly")
    }
}*/

fun main() {
    val coco = Bird("coco", 2, "long")
    coco.fly()
}