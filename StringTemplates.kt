/**
 * Created by hht-admin on 2017/6/7.
 * Content:Learn String Templates(模版)
 */
fun main(args: Array<String>) {
    var a = 1
    // simple name in template(使用变量名作为模版)
    val s1 = "a is $a "

    a = 2
    // arbitrary expression in template(使用表达式作为模版)
    val s2 = "${s1.replace("is","was")},but now is $a"

    println(s1)
    println(s2)
}

