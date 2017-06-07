/**
 * Created by hht-admin on 2017/6/7.
 * Content:Null Check
 *
 *         Safe Calls :Your second option is the safe call operator,written '?.'
 *         Like: b?.length
 */
fun main(args: Array<String>) {


    println(parseInt("1"))           // 1
    println(parseInt("realmo"))     // null

    printProduct("a","b")       //either 'a' or 'b' is not a number
    printProduct("2","b")       //either 'a' or 'b' is not a number
    printProduct("1","2")       //2

    printProduct1("a","b")       //Wrong number format in arg1: 'a'
    printProduct1("2","b")       //Wrong number format in arg1: 'b'
    printProduct1("1","2")       //2
}

/*
* A reference must be explicityly marked as nullable when null value is possible.
*
* Return null if str does not hold an integer.
*
* 当空值可能出现时应该明确指出该引用可空。
* 下面的函数是当 str 中不包含整数时返回空:
* */
fun parseInt(str:String):Int?{
    return str.toIntOrNull()
}


fun printProduct(arg1:String,arg2:String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if(x != null && y !=null){
        println(x*y)
    }
    else{
        println("either '$arg1' or '$arg2' is not a number")
    }
}


fun printProduct1(arg1:String,arg2:String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    if( x == null){
        println("Wrong number format in arg1: '${arg1}'")
        return
    }

    if( y == null){
        println("Wrong number format in arg2: '${arg2}'")
        return
    }

    println(x*y)
    return
}
