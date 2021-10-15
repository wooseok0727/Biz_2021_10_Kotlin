import kotlin.random.Random

fun main() {

    val rnd:Random = Random(System.currentTimeMillis())

    // 내용을 추가 삭제 변경이 가능한 배열
    val array = arrayListOf<Int>()

    for(num in 1..10) {
        var rndNum = rnd.nextInt(100) + 1
        array.add(rndNum)
    }
    println(array)

    val evens = array.filter { it % 2 == 0 }

    println(evens)
}