import java.lang.NumberFormatException
import java.util.*
import kotlin.math.pow

fun main() {

    var scan:Scanner = Scanner(System.`in`)

    print("반지름 값을 입력하세요 : ")
    var strInput = scan.nextLine()
    var radius:Double = try {
        strInput.toDouble()
    } catch (e:NumberFormatException) {
        println("숫자를 입력하세요")
        return
    }
    var pi = Math.PI

    // 원의 둘레 : 반지름 * 2 * PI ( 2πr)
    println("원의 둘레 : ${radius * pi * 2}")

    // 원의 면적 : 반지름 * 반지름 * PI ( πr²)
    println("원의 면적 : ${radius.pow(2) * pi}")

    // 구의 표면적 : 반지름 * 반지름 * 4 * PI (4 πr²)
    println("구의 표면적 : ${radius.pow(2) * pi * 4}")

    // 구의 부피 : 반지름 * 반지름 * 반지름 * PI * (4/3) (⁴⁄₃πr³)
    println("구의 부피 : ${radius.pow(3) * pi * 4 / 3}")


}