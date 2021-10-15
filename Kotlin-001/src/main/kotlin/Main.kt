import java.lang.NumberFormatException
import java.util.*

fun main() {

    var scan: Scanner = Scanner(System.`in`)

    var intNum1: Int = 0
    var intNum2: Int = 0

    while(true) {
        print("숫자 1을 입력해주세요 : ")
        var input1: String = scan.nextLine()


        try {
            intNum1 = Integer.valueOf(input1)
        } catch (e: NumberFormatException) {
            println("정수형 숫자를 입력해주세요")
            continue
        }
        break
    }

    while (true) {
        print("숫자 2를 입력해주세요 : ")
        var input2: String = scan.nextLine()

        try {
            intNum2 = Integer.valueOf(input2)
        } catch (e: NumberFormatException) {
            println("정수형 숫자를 입력해주세요 :")
            continue
        }
        break
    }

    if (intNum1 < intNum2) {
        var temp = intNum1
        intNum1 = intNum2
        intNum2 = temp
    }

    /**
     * 함수에 값을 전달하면서 직접 매개변수 이름에 값을 할당하여 전달
     * Call By Name
     */
    view(num1 = intNum1,num2 =intNum2)
}


fun view(num1: Int, num2: Int) {

    println("$num1 + $num2 = ${num1 + num2}")
    println("$num1 - $num2 = ${num1 - num2}")
    println("$num1 * $num2 = ${num1 * num2}")
    println("$num1 / $num2 = ${num1 / num2}")
}