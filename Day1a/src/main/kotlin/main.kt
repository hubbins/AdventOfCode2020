import java.io.File

fun main(args: Array<String>) {

    val dataSet = getData("input.txt")

    val item = dataSet.find { dataSet.contains(2020 - it) }
    if (item != null) {
        val otherItem = 2020 - item
        println("${item} + ${otherItem} = ${item * otherItem}")
    }
}

fun getData(fileName: String): HashSet<Int> {
    val inputSet = HashSet<Int>()

    File(ClassLoader.getSystemResource(fileName).file)
        .readLines()
        .forEach {
            if (it.trim().length > 0) {
                inputSet.add(it.toInt())
            }
        }

    return inputSet
}
