import java.io.File

fun main(args: Array<String>) {

    val dataSet = getData("input.txt")

   for (first in dataSet.stream()) {
        val second = dataSet.find { t -> dataSet.contains((2020 - first) - t) }
        if (second != null) {
            val third = 2020 - first - second
            println("${first} + ${second} + ${third} = ${first + second + third}")
            println("${first} * ${second} * ${third} = ${first * second * third}")
            break
        }
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
