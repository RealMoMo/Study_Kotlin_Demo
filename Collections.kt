/**
 * Created by RealMo on 2017/6/8.
 * Content: Using Collections
 */
fun main(args: Array<String>) {


    //lterating over a collection
    val items = listOf("apple", "banana", "bear")
    for (item in items) {
        println(item)
    }


    //checking if a collection contains an object using 'in' operator
    when {
        "apple" in items -> println("have apple")
        "Kotlin" !in items -> println("Kotlin not in list")
    }

    //using lambda expression to filter and map clooections
    val fruits = listOf("avpcado","apple","banana","bear")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach{println(it)}
}
