/**
 * Created by RealMo on 2017-06-13.
 * Content:Learn String
 */
fun main(args: Array<String>) {
    /*
    * Strings are immutable. Elements of a string are characters that can be accessed
    * by the indexing operation: s[i] . A string can be iterated over with a for-loop:
    * */
    val str ="abcdefg"

    for (c in str){
        print("$c ")
    }

    /*
    * String Literals(字符串字面量)
    * Kotlin has two types of string literals: escaped strings that may have escaped characters in them and raw strings that can
    * contain newlines and arbitrary text.
    * Kotlin 有两种类型的字符串字面量：一种是可以带分割符的，一种是可以包含新行以及任意文本的。
    * */
    val s ="Hello world!\n"
    val text ="""
        for(c in "foo")
        print(c)
        """         //""" text""" = "text"

    println(s)
    println(text)

    //we can remove leading whitespace with 'trimMargin()' function
    val text2 = """
|Tell me and I forget.
|Teach me and I remember.
|Involve me and I learn.
|(Benjamin Franklin)
""".trimMargin()
    //By default | is used as margin prefix, but you can choose another character and pass it as a parameter, like trimMargin(">") .

    println(text2)


    /*
    * String Templates(字符串模版)
    *
Strings may contain template expressions, i.e. pieces of code that are evaluated and whose results are concatenated into the
string. A template expression starts with a dollar sign ($) and consists of either a simple name:
字符串可以包含模板表达式，即可求值的代码片段，并将其结果连接到字符串中。一个模板表达式由一个 $ 开始并包含另一个简单的名称：

val i = 10
val s = "i = $i" // evaluates to "i = 10"
or an arbitrary expression in curly braces:
或者是一个带大括号的表达式：

val s = "abc"
val str = "$s.length is ${s.length}" // evaluates to "abc.length is 3"
Templates are supported both inside raw strings and inside escaped strings. If you need to represent a literal $ character in a
raw string (which doesn't support backslash escaping), you can use the following syntax:
模板既可以原始字符串中使用，也可以在转义字符串中使用。如果需要在原始字符串(不支持反斜杠转义)中表示一个文字$字符，那么可以使用以下语法：

val price = """
${'$'}9.99
"""
    * */
}
