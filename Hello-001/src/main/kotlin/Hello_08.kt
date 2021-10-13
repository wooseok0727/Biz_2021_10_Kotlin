import java.lang.NumberFormatException
import java.util.*

// public 선언변수는 프로젝트 전체에 공용으로 사용되므로
// 프로젝트 전체에 유일한 이름이어야 한다
val scan2: Scanner = Scanner(System.`in`)

fun main() {

    var intNum1 = 0;
    var intNum2 = 0;

    while (true) {
        print("정수형 숫자 1을 입력하세요 : ")
        var num1: String = scan2.nextLine()
        try {
            intNum1 = Integer.valueOf(num1);
        } catch (e: NumberFormatException) {
            println("정수형 숫자만 입력하세요")
            continue;
        }
        break
    }

    while (true) {
        print("정수형 숫자 2를 입력하세요 : ")
        var num2: String = scan2.nextLine()
        try {
            intNum2 = Integer.valueOf((num2))
        } catch (e: NumberFormatException) {
            println("정수형 숫자만 입력하세요")
            continue;
        }
        break
    }

    println("$intNum1 + $intNum2 = ${intNum1 + intNum2}")
    println("$intNum1 - $intNum2 = ${intNum1 - intNum2}")
    println("$intNum1 * $intNum2 = ${intNum1 * intNum2}")
    println("$intNum1 / $intNum2 = ${intNum1 / intNum2}")
    return


}