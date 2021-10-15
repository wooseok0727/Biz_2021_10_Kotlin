import java.lang.NumberFormatException
import java.util.*

fun main() {

    val scan:Scanner = Scanner(System.`in`)

    while (true) {

        print("첫번째 정수를 입력하세요 : ")
        val strNum1 = scan.nextLine()
        val intNum1 = try {
            Integer.valueOf(strNum1)
        } catch (e:NumberFormatException) {
            println("정수로만 입력해야 합니다")
            continue
        }

        print("두번째 정수를 입력하세요 : ")
        val strNum2 = scan.nextLine()
        val intNum2 = try {
            Integer.valueOf(strNum2)
        } catch (e:NumberFormatException) {
            println("정수로만 입력해야 합니다")
            continue
        }
    }
}