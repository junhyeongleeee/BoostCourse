package functionalProgramming

fun main() {

//    functionalProgramming.noParam ({ "Hello World" })
    noParam { "Hello World" }

//    functionalProgramming.oneParam { a -> "Hello World!! $a" }
    oneParam { "Hello World!! $it" }        // 람다식의 매개변수가 하나일 경우만 사용 가능 (it)

//    functionalProgramming.moreParam { a, b -> "Hello World!! $a $b" }
    moreParam { _, b -> "Hello World!! $b" }    // 사용하지 않을 경우 _ 로 생략 가능

//    functionalProgramming.withArgs("Args1", "Args2", { a, b -> "Hello World! $a $b" })
    withArgs("Args1", "Args2") { a, b -> "Hello World! $a $b" }

//    functionalProgramming.twoLambdaParam({ a, b -> "First $a $b" }, { "Second $it" })
    twoLambdaParam({ a, b -> "First $a $b" }) { "Second $it" }
}

fun noParam(out: () -> String) {
    println(out())
}

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}

fun withArgs(a: String, b: String, out: (String, String) -> String) {
    println(out(a, b))
}

fun twoLambdaParam(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}