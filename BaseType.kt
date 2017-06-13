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

    /*
    * Characters
    *
    * Characters are represented bt the type 'char'.They can not be treated directly as numbers
    *
    * val c :char = '1'
    * c==1 //error:incompatible types
    *
    * c.toInt() == 1 //ok
    * */

    /*
    *
    * Booleans
    *
    * has two values:true and false
    *
    * Booleans are boxed if anullable reference is needed.
    *
    * Built-in operations on booleans include.
    *  || lazy disjunction（短路或）
    *  && lazy conjunction（短路与）
    *  !  negation(非)
    *
    * */

    /*
    * Arrays(数组)
    *
    * Arrays in Kotlin are represented by the 'Array' class,that has 'get' and 'set'
    * functions(that turn into [] by operator overloading conventions. ),and 'size'
    * property,along with a few other useful member functions.
    * 数组在 Kotlin 中由 Array 类表示，有 get 和 set 方法(通过运算符重载可以由[]调用)，
    * 以及 size 方法，以及一些常用的函数.
    *
    *
    *
class Array<T> private constructor() {
val size: Int
operator fun get(index: Int): T
operator fun set(index: Int, value: T): Unit
operator fun iterator(): Iterator<T>
// ...
}
To create an array, we can use a library function arrayOf() and pass the item values to it, so that arrayOf(1, 2, 3) creates
an array [1, 2, 3]. Alternatively, the arrayOfNulls() library function can be used to create an array of a given size filled with null
elements.
Another option is to use a factory function that takes the array size and the function that can return the initial value of each array
element given its index:
我们可以给库函数 arrayOf() 传递每一项的值来创建Array，arrayOf(1, 2, 3) 创建了一个[1, 2, 3] 这样的数组。也可以使用库函数 arrayOfNulls() 创建一个指定大小的空Array。
或者通过指定Array大小并提供一个通过索引产生数组元素值的工厂函数：

// Creates an Array<String> with values ["0", "1", "4", "9", "16"]
val asc = Array(5, { i -> (i * i).toString() })
As we said above, the [] operation stands for calls to member functions get() and set() .
Note: unlike Java, arrays in Kotlin are invariant. This means that Kotlin does not let us assign an Array<String> to an
Array<Any> , which prevents a possible runtime failure (but you can use Array<out Any> , see Type Projections).
Kotlin also has specialized classes to represent arrays of primitive types without boxing overhead: ByteArray , ShortArray ,
IntArray and so on. These classes have no inheritance relation to the Array class, but they have the same set of methods
and properties. Each of them also has a corresponding factory function:
像我们上面提到的，[] 操作符表示调用　get() set() 函数
注意：和 java 不一样，arrays 在 kotlin 中是不可变的。这意味这 kotlin 不允许我们把 Array<String> 转为 Array<Any> ,这样就阻止了可能的运行时错误(但你可以使用 Array<outAny> , 参看 Type Projections)
Kotlin 有专门的类来表示原始类型从而避免过度装箱： ByteArray, ShortArray, IntArray 等等。这些类与 Array 没有继承关系，但它们有一样的方法与属性。每个都有对应的库函数：


val x: IntArray = intArrayOf(1, 2, 3)
x[0] = x[1] + x[2]
    *
    * */

}
