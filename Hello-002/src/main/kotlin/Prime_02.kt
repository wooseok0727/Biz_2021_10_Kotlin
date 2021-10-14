import java.util.*
import kotlin.random.Random

var rnd:Random = Random(System.currentTimeMillis())

// 코틀린에서 == 연산자가 기본이다. 그러나 자바와는 동작 방식에 조금 차이가 있다.
// 원시 타입 두개를 비교할 때는 == 연산자가 동일하게 동작하지만,
// 참조 타입을 비교할 때 다르게 동작한다.
// ==는 내부적으로 equals를 호출한다.
// 따라서 참조 타입인 두 개의 String을 ==연산으로 비교하면
// 주소값이 아닌 값(동등성)비교를 한다.

// 참조 타입의 주소 값을 비교(reference comparision)하고 싶다면?

// 코틀린은 자바에는 없는 ===연산자를 지원한다.
// 참조 비교를 위해서 === 연산자를 사용하면 된다.
// 즉, 자바의 주소 값 비교인 ==와 코틀린의 ===가 동일한 역할을 한다.

fun main() {

    var scan:Scanner = Scanner(System.`in`)
    while(true) {
        prime()
        println("계속할까요? (Enter:계속, END:끝내기)")
        var input:String = scan.nextLine()

        if(input == "END") {
            break
        }
    }
    println("GAME OVER")
}

fun prime() {

    var num1:Int = rnd.nextInt(100)

    println("생성된 난수 : $num1")

    // range 데이터(일종의 유사배열)
    // filter를 사용하여 num1값과 % 연산을 하여 결과가 0인 친구들만
    // 추출하여 resultArray 담아라
    var resultArray = (2 until num1).filter { num1 % it == 0 }
    println(resultArray)
    
    if(resultArray.isEmpty()) {
        println("$num1 은 소수")
    } else {
        println("$num1 은 소수가 아님")
    }
}