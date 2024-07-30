fun main() {
    //Predefined functions
    println("eMobilis")
    var squareroot = Math.sqrt(144.0)
    println("The squareroot is $squareroot")

    var round = Math.round(32.89)
    println("The final output is $round")

    var myceil = Math.ceil(45.67)
    println(myceil)


    month()
    multiply()
    student("Neemah",19)
    student("Makena",20)

}

//User-defined functions
fun month(){
    println("The month is July")
}

fun multiply(){
    var num1 = 20
    var num2 = 5
    println(num1 * num2)
}
//Parameter and Arguments
fun student(name:String,age:Int){
    println("$name is $age years old")
}
