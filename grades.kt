import java.util.Scanner
fun main() {
    val reader = Scanner(System.`in`)
    print("Please Enter your marks \n")
    val marks:Int= reader.nextInt()// nextLong(), nextFloat(), nextDouble()
    // and nextBoolean() methods respectively.
    //<<val name = readLine()<<for strings

    if (marks>80){
        println("Grade=A")
    }
    else if (marks>70){
        println("Grade=B")
    }
    else if (marks>60){
        println("Grade=C")
    }
    else if (marks>50){
        println("Grade=D")
    }
    else if (marks>40){
        println("Grade=E")
    } else{
        println("Grade=FAiL")
    }
}
