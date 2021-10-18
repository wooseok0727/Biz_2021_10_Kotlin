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

    // filter : array 배열에서 조건에 맞는 요소만 추출하여
    //      evens 배열에 담기
    // val evens = array.filter { arr-> arr % 2 == 0 } : lambda 방식

    // it 키워드를 사용하여 KT 고유방식으로
    val evens = array.filter { it % 2 == 0 }

    println(evens)

    var evenSum = 0
    for(arr in evens ) {
        evenSum += arr
    }
    println("짝수들의 합 : $evenSum")

    val evenSum1 = array.sumOf { if(it % 2 == 0) it else 0 }
    println("짝수들의 합 : $evenSum1")
}