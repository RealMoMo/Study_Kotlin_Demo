/**
 * Created by hht-admin on 2017/6/7.
 * Content:Learn Conditional Expressions
 */
fun main(args: Array<String>) {
    println(maxNumber(66,6))
    println(maxNumber1(6,66))
}


//conditional expressions
fun maxNumber(a:Int ,b:Int):Int{
    if (a>b)
        return a
    else
        return b
}

//using if as an expression
fun  maxNumber1(a:Int ,b:Int) = if(a>b) a else b
