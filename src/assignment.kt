import java.util.Scanner

//Program that will allow you to enter a letter and determine if it is a vowel or consonant


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter Character :")
    val c = scanner.next().single()

    when (c){
        'a','e','i','o','u','A','E','I','O','U' -> println("The character $c is a vowel")
        else -> println("The character $c is a consonant")
    }


    
}