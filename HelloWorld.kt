/**
 * Created by hht-admin on 2017/6/7.
 * Content: Learn Hello World
 *          Learn Defining Functions
 */
fun main(args: Array<String>) {
    println("Hello World")
    println(sum(1,1))
    println(sum1(1,1))
    sum2(1,1)
    sum3(1,1)
}


fun sum(a :Int, b : Int): Int{
    return a+b
}
//inferred return type
fun sum1(a :Int,b:Int) = a+b

//return no meaningful value
fun sum2(a :Int ,b:Int): Unit{
    println("sum2 of is ${a+b}")
}

//unit return tyoe can be omitted
fun sum3(a:Int ,b :Int){
    println("sum3 of is ${a+b}")
}