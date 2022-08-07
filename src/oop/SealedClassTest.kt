package oop

/*sealed class Result<T> {
    open class Success<T>(val value:T):Result<T>()
    class Fail<T>:Result<T>()
}

//sealed class Result

class Status<T>: Result<T>()
class Inside<T>(value: T): Result.Success<T>(value)*/

sealed class Result<T>

open class Success<T>(val value:T):Result<T>()
val name = ""
class Fail<T>:Result<T>()

class Status<T>: Result<T>()
class Inside<T>(value: T): Success<T>(value)


fun main() {
    // Success 객체 생성
    val result = Success("Good!!")
    val msg = eval(result)

    println(msg)



}

fun <T>eval(result: Result<T>): Result<T> = when(result) {
    is Success -> Success(result.value)
    is Inside -> Inside(result.value)
    is Fail -> Fail()
    is Status -> Status()
}

class Test {
}

