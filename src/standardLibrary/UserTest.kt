package standardLibrary

import java.io.BufferedReader
import java.io.FileReader

/**
 *  user() : 사용했으면 닫어! 쫌!!
 *      - use 를 사용하면 객체를 사용한 후 close() 등을 자동적으로 호출해 닫아준다.
 *          public inline fun <T: Closeable?, R> T.use(block: (T) -> R): R
 *          public inline fun <T: AutoCloseable?, R> T.use(block: (T) -> R): R
 *
 *      - T의 제한된 자료형을 보면 Closeable?로 block 은 닫힐 수 있는 객체를 지정해야 한다.
 *      - Java 7 이후는 AutoCloseable?로 사용된다.
 *
 */

fun main() {

}

private fun readFirstLine(): String {
    BufferedReader(FileReader("test.file")).use { return it.readLine() }
}