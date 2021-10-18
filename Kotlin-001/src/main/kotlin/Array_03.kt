import kotlin.random.Random

fun main() {

    val rnd: Random = Random(System.currentTimeMillis())
    val array = arrayListOf<Int>()

    for(num in 0 until 10) {
        val rndNum:Int = rnd.nextInt(100) + 1
        array.add(rndNum)
    }

    val primes = array.filter {

        // it 이이 소수인가 ? 판별하는 코드
       // 소수가 맞다 return true

        var flag = true
        for(num in 2 until it) {
            if (it % num == 0) {
                flag = false
                break
            }
        }
        flag
    }
    println(primes)

}