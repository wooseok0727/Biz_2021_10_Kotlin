import java.lang.NumberFormatException
import java.util.*

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    while(true) {
        print("정수값을 입력하세요(END: 끝내기) : ")
        var strNum = scan.nextLine()
        if(strNum.equals("END")) {
            break
        }

        var intNum = try {
            Integer.valueOf(strNum)
        } catch (e:NumberFormatException) {
            println("정수만 입력하세요")
            println("다시 입력하세요")
            continue
        }

        if(intNum % 3 == 0) {
            println("$intNum 은 3의 배수")
        } else {
            println("$intNum 은 3의 배수가 아님")
        }
    }
    println("GAME OVER")
}