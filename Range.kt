/**
 * Created by hht-admin on 2017/6/8.
 * Content:Using Ranges
 */
fun main(args: Array<String>) {
    println(checkInRange(21))       //true
    println(checkInRange(-1))       //false

    println(checkOutRange(21))      //false
    println(checkOutRange(-1))      //true


    iterationRange()
    iterationProression()

}

/*
* check if a number is whithin a range using 'in' operator
* */
fun checkInRange(x:Int):Boolean{
    val min = 0
    val max = 66
    if(x in min ..max){
        return true
    }else{
        return false
    }
}

/*
* check if a number is out of range
* */
fun checkOutRange(x:Int):Boolean{
    val min = 0
    val max = 66
    if(x !in min ..max){
        return true
    }else{
        return false
    }
}

/*
* lteration over a range
* */
fun iterationRange():Unit{
    for (x in 1..5){
        print(" $x")
    }
    println()
}
//or voer a progression (使用步进)
fun iterationProression():Unit{
    for (x in 1..20 step 3){
        //step each 3progression
        print(" $x")
    }

    println()
    for (x in 20 downTo  0 step 3 ){
        //downTo step 3progression
        print(" $x")
    }
}
