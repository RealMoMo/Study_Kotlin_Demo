/**
 * Created by RealMo on 2017-06-07.
 * Content:Type Checks and Automatic casts
 *
 *          The 'is' operator checks if an expression is an instance
 *          of a type.
 */
fun main(args: Array<String>) {
    getType("string")  //string type
    getType(666)        //int type
    getType(6.1f)       //float type
    getType(6.1)        //double type
    getType('o')        //null
}


fun getType(obj : Any): Unit?{
   if(obj is String)return println("String type")
    if(obj is Int)return println("Int type")
    if(obj is Float)return println("Float type")
    if(obj is Double)return println("Douoble type")
    return println("null")
}