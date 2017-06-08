/**
 * Created by RealMo on 2017-05-24
 * Content:Learn Basic Tpyes
 */

/*
* In Kotlin,everthing is an object in the sense that
* we can call member functuions and properties on any variable.
* */
fun main(args: Array<String>) {
    /**
     *
     * Numbers
     * 类型      位宽
     * Double           64
     * Float            32
     * Long             64
     * Int              32
     * Short            16
     * Byte             8
     *
     * Note that characters are not numbers in Kotlin.
     *
     *
     *
     *
     * Kotlin不支持8进制
     * 10进制：123
     * 16进制：0x0f
     * 二进制：0b00001010
     *
     *
     * 数值常量可以添加下划线分割  for   增强可读性
     * for example:
     * val oneMillion = 1_000_000
     * val securityNumber = 999_99_999L
     *
     *
     *
     */


        /*
        * Representation(表示)
        *
        *
        *       Note that boxing of numbers does not necessarily preserve identity:
        *
        *       val a: Int = 10000
                print(a === a) // Prints 'true'
                val boxedA: Int? = a
                val anotherBoxedA: Int? = a
                print(boxedA === anotherBoxedA) // !!!Prints 'false'!!!

                On the other hand, it preserves equality:
                val a: Int = 10000
                print(a == a) // Prints 'true'
                val boxedA: Int? = a
                val anotherBoxedA: Int? = a
                print(boxedA == anotherBoxedA) // Prints 'true'
        *
        * */

        /*
        * Explicit Conversions(显式转换)
        * Due to different representations, smaller types are not subtypes of bigger ones. If they were, we would have troubles of the
        * following sort:
        *
        *       // Hypothetical code, does not actually compile:
                val a: Int? = 1 // A boxed Int (java.lang.Integer)
                val b: Long? = a // implicit conversion yields a boxed Long (java.lang.Long)
                print(a == b) // Surprise! This prints "false" as Long's equals() check for other part to be Long as well

                As a consequence, smaller types are NOT implicitly converted to bigger types. This means that we cannot assign a value of type
                Byte to an Int variable without an explicit conversion
                所以，短类型是不会隐式转换为长类型的。这意味着我们必须显式转换才能把 Byte 赋值给 Int

                val b: Byte = 1 // OK, literals are checked statically
                val i: Int = b // ERROR

                we can use explicit conversion to widen numbers
                val i:Int = b.toInt() // ok:explicitly widened
        * */
/*
*      每个数值类型都支持下面的转换：

        toByte(): Byte
        toShort(): Short
        toInt(): Int
        toLong(): Long
        toFloat(): Float
        toDouble(): Double
        toChar(): Char
* */

}
