import java.util.Scanner

fun main() {
    var number = Scanner(System.`in`)
    println("Enter first number :")
    var x = number.nextInt()

    println("Enter second number :")
    var y = number.nextInt()


    if (x > y){
        println("$y is the smallest number")
    }
    else{(y < x)
        println("$x is the smallest number")
    }


}




