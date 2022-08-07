package oop

data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"
    constructor(name: String, email: String, _job: String): this(name, email) {
        job = _job
    }
    init {
        // 간단한 로직
    }
}

fun test() {
    val customer1 = Customer("JunHyeong", "djskal...")

    val (name, email) = customer1
    println("name = $name, email = $email")

    val customers = mutableListOf<Customer>()



    // 람다식 함수로 Destructuring 된 변수 출력해 보기
    val myLambda = {
        (nameLa, emailLa): Customer ->
        println(nameLa)
        println(emailLa)
    }
}