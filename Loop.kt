/**
 * Created by RealMo on 2017-06-08.
 * Content:Using a for loop
 *         Using a while loop
 *         Using when expression
 */
fun main(args: Array<String>) {
    //for
    val forItems = listOf<String>("RealMadrid","RealMO","RealMoMo")
    for (item in forItems) {
        println(item) //RealMadrid ...
    }

    //or
    for(index in forItems.indices){
        println(index)//0 1 2
    }

    //while
    val whileItems = listOf<String>("apple","banana","bear")
    var index = 0
    while (index < whileItems.size){
        println("${whileItems[index]}")
        index++
    }

    //when
    println(testWhen(1))
    println(testWhen("Hello"))
    println(testWhen(11))


}

//when
fun testWhen(obj : Any):String=
        when(obj){
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String ->"Not a String"
            else ->"Unknown"
        }
    


