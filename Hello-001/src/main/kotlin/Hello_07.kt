import java.util.*

// public 변수로 scan을 선언
// type 은 java.util.Scanner class
val scan1:Scanner = Scanner(System.`in`)

fun main() {

    print("문자열을 입력 : ")
    var input:String = scan1.nextLine()
    println("입력한 문자열 : $input")

    /**
     * 키보드를 사용하여 2개의 문자열형 숫자를 입력 받고
     * 두 숫자의 4칙연산을 수행하여 console에 표시하시오
     */

    print("첫번째 숫자를 입력해주세요 : ")
    var num1:Int = Integer.parseInt(scan1.nextLine())
    print("두번째 숫자를 입력해주세요 : ")
    var num2:Int = Integer.parseInt(scan1.nextLine())

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 * $num2 = ${num1 * num2}")
    println("$num1 / $num2 = ${num1 / num2}")
}