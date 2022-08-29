package sort

data class ToBeSorted (
    val num: Int,
    val data: String
        )

fun main() {
    val immList = listOf("wefewf", "AWef", "s", "Afwewfew")
    val mList = mutableListOf("wefewf", "AWef", "s", "Afwewfew")

    // 기본적인 문자열 ASCII 값을 비교하여 정렬한다.
    immList.sorted()

    val comparator: Comparator<String> = compareBy { it.length }
    val lengthOrder = immList.sortedWith(comparator)


    val toBeSorted = mutableListOf<ToBeSorted>()

    toBeSorted.sortedWith(compareBy<ToBeSorted> { it.num }.thenBy { it.data })
    toBeSorted.sortedBy { it.num }
}