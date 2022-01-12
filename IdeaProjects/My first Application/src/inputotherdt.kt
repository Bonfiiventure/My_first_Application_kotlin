import java.util.Scanner
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    println("Enter your age")
    var age = read.nextInt()/// nextLong(), nextFloat(), nextDouble()
    // and nextBoolean() methods respectively.
    //<<val name = readLine()<<for strings
    println("Your input age is "+age)
}