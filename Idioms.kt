import sun.management.Agent
import java.io.File

/**
 * Created by RealMo on 2017/6/8.
 * Content:Idioms(习惯用语)
 */
fun main(args: Array<String>) {

    filtering()

    stringINterpolation("Kotlin")

    instanceChecks(Customer("mo", "123@qq.com"))
    instanceChecks("haha")

    traversingCollection()

    other()

    //about extension functions
    "Convert this to camelcase".spaceToCamelCase()


    notNullShorthand()

    returnWhenStatement("Green")

    println(theSingle())    //42

}

/*
* Creating DTOs(POJOs/POCOs)
* provides a 'Customer' class with following functionality:
* getters(and setters in case of vars) for all properties
* equals
* hashcode
* toString
* copy
* component1(),...2(),...for all properties
* */
data class Customer(val name: String, val email: String)

data class Student(val name: String, var age: Int, val sex: String)

/*
* Default values for function parameters
* */
fun foo(a: Int = 0, b: String = "") {
    //...
}

/*
* Filtering a list
* */
fun filtering() {
    val list = listOf(0, 1, 2, 3, 4, 5)
    val positives = list.filter { x -> x > 0 }
    println(positives)      //[1,2,3,4,5]

    //or alternatively,even shorter
    val positives1 = list.filter { it > 0 }
    println(positives1)

}

/*
* String lnterpolation(字符串插值)
* */
fun stringINterpolation(str: String = "RealMo") {
    println("str $str")
}

/*
* Instance Checks(实例检查)
* */
fun instanceChecks(x: Any) {
    when (x) {
        is Customer -> println("is Customer")
        is Student -> println("is Student")
        else -> println("not Customer,not Student")
    }
}

/*
* Traversing a map/list of pairs(遍历map/list)
* */
fun traversingCollection() {
    val myMap = mapOf(1 to "momo", 2 to "jenny", 3 to "tony", 4 to "eason")
    // k,v can be called anything
    for ((k, v) in myMap) {
        println("$k -> $v")
    }
}

/**
 * Using Ranges
 */
fun ranges(x: Int) {
    for (x in 1..100) {
    }     //closed range:includes 100
    for (x in 1 until 100) {
    }        //half-open range:does not include 100
    for (x in 2..10 step 2) {
    }
    for (x in 10 downTo 1) {
    }
}


/*
* Other
* */
fun other() {
    //read-only list
    val list = listOf(1, 2, 3)

    //read-only map
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    //accessing a map(访问map)
    var map1 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])  //intput 'key'
    map1["a"] = 66
    println(map1["a"])     //66


    //lazy property
//    val p :String by lazy {
//
//    }

}

/*
* Extension Functions(扩展函数)
* 类似自定义函数 --扩展String类的函数
* */
fun String.spaceToCamelCase() {

    //.........
}


/*
* Creating a singleton
* */
object Resource {
    val name = "Name"
}


fun notNullShorthand() {

    /*
    * if not null shorhand(如果不为空则... 的简写)
    * */

    val files = File("Test").listFiles()
    println(files?.size)

    /*
    * if not null and else shorthand(如果不为空...否则... 的简写)
    * */
    println(files?.size ?: "empty")

    /*
    * Executing a statement if null(如果声明为空执行某操作)
    * */
    val data = mapOf("email" to null, "momo" to "not null")
    val email = data["email"] ?: println("Email is missing!")

    /*
    * Execute if not null(如果声明不为空执行某操作
    * */
    data["momo"]?.let {
        //execute this block if not null
        println("momo not null")
    }
}

/*
* Return on when statement(返回when判断)
* */
fun returnWhenStatement(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Blue" -> 1
        "Green" -> 2
        else ->throw IllegalStateException("Invalid color param value")
    }
}


/*
* try/catch expression
* */
fun testTryCatch(){
    val result =
            try {
                //...
            }catch (e: Exception){
                //...
            }

    //working with result (处理result)
    //...
}

/*
* if expression
* */
fun ifExpression(param:Int){
    val result = if (param == 1){
        "one"
    } else if(param == 2){
        "two"
    } else {
        "three"
    }
}

/*
* Builder-style usage of methods that return Unit
* 方法使用生成器模式返回Unit
* */
fun arrayOfMinusOnes(size:Int):IntArray{
    return IntArray(size).apply { fill(-1) }
}

/*
* Single-expression functions
* */
fun theSingle() = 42
//This is equivalent to
fun theSingle2():Int{
    return 42
}


/*
* This can be effectively combined with other idioms, leading to shorter code. E.g. with the when-expression:
* */
fun transform(color: String): Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    "Blue" -> 2
    else -> throw IllegalArgumentException("Invalid color param value")
}


/*
* Calling mutiple methods on an object instance ('with')
* */
//class Turtle {
//    fun penDown()
//    fun penUp()
//    fun turn(degrees: Double)
//    fun forward(pixels: Double)
//}
//val myTurtle = Turtle()
//with(myTurtle) { //draw a 100 pix square
//    penDown()
//    for(i in 1..4) {
//        forward(100.0)
//        turn(90.0)
//    }
//    penUp()
//}

/*
* Consuming a nullable Boolean
* */
fun booleanNull(test : Boolean?){
    val b : Boolean?= test
        if (b == true){
            //b = true
    }else{
        // b = false or null
    }
}



