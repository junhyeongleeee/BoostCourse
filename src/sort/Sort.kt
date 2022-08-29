package sort


fun main() {
    val immutableList = listOf(5, 4, 3, 2, 1)
    val mutableList = mutableListOf(5, 4, 3, 2, 1)

    // sorting
    immutableList.sorted().reversed()

    mutableList.sort()
    mutableList.reverse()
}