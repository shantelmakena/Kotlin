import java.util.Scanner


fun main() {
    var read = Scanner(System.`in`)
    println("Enter Student Name : ")

    var name = readln()
    println("The name of the student is $name")

    println("Enter course : ")
    var course = readln()
    println("The student studies $course")

    println("Enger the age of the student : ")
    var age = read.nextInt()
    println("The student is $age years old")
}