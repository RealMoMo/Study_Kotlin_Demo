/**
 * Created by RealMo on 2017-06-10.
 * Content:Operations(运算符)
 *          1.Operator overloading
 *          2.arithmeticOperators
 *          3.In
 *          4.Indexed access operator
 *          5.Invoke operator
 *          6.Augmented assignments
 *          7.Equality and inequality operators
 *          8.Comparison operators
 *          9.Bitwise operations(位运算)
 */
fun main(args: Array<String>) {

    var a = 2
    a.unaryPlus()  // as +a  = 2(取正,并没有改变a的实际值)

    a.unaryMinus() // as -a  = -2(取负，并没有改变a的实际值)

    var b = true
    b.not()     //!b

    var c = 6
    c.inc()  //c++ = 7  并没有改变c的实际值
    c.dec()  //c-- = 5
    ++c     // 改变c的实际值
    println(c)//7


}

fun arithmeticOperators(a:Int,b:Int){
    a.plus(b)       //a+b
    a.minus(b)      //a-b
    a.times(b)      //a*b
    a.div(b)        //a/b
    a.rem(b)        //a%b   (Kotlin1.1)
    a.mod(b)        //a%b(方法已过时)
    a.rangeTo(b)    //a..b

}

//'In' operator
fun inOperator(a:Int,b:Array<Int>){
    b.contains(a)       //a in b
    !b.contains(a)      //a !in b
}


fun otherOperator(){

    //Indexed access operator
//    a[i]	a.get(i)
//    a[i, j]	a.get(i, j)
//    a[i_1, ..., i_n]	a.get(i_1, ..., i_n)
//    a[i] = b	a.set(i, b)
//    a[i, j] = b	a.set(i, j, b)
//    a[i_1, ..., i_n] = b	a.set(i_1, ..., i_n, b)

    //Invoke operator
//    a()	a.invoke()
//    a(i)	a.invoke(i)
//    a(i, j)	a.invoke(i, j)
//    a(i_1, ..., i_n)	a.invoke(i_1, ..., i_n)

    //Augmented assignments
//    a += b	a.plusAssign(b)
//    a -= b	a.minusAssign(b)
//    a *= b	a.timesAssign(b)
//    a /= b	a.divAssign(b)
//    a %= b	a.modAssign(b)

    //Equality and inequality operators
//    a == b	a?.equals(b) ?: (b === null)
//    a != b	!(a?.equals(b) ?: (b === null))

    //Comparison operators
//    a > b	a.compareTo(b) > 0
//    a < b	a.compareTo(b) < 0
//    a >= b	a.compareTo(b) >= 0
//    a <= b	a.compareTo(b) <= 0
}


fun bitwiseOperators(){
    var x : Int
    x = (1 shl 2) //l- left 有符号左移（相当于java <<）
    x = (1 shr 2) //r - right 有符号右移(相当于java >>)
    x = (1 ushr 2)//无符号右移(相当于java >>>)
    x = (1 and 2) //按位与
    x = (1 or 2) //按位或
    x = (1 xor 2) //按位异或
    x =( 1.inv() ) //按位翻转

}




