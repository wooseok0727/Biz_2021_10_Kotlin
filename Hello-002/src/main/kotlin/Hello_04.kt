fun main() {

    var num1 = 10

    /**
     * 0부터 num1 까지 반복하면서
     * 각 요소를 num 변수에 담아 내부로 전달
     */
    for(num in 0..num1) {
        print("$num,")
    }
    println()

    for(num in 0..10) {
        print("$num,")
    }
    println()

    for(num in 0 until 10) {
        print("$num,")
    }
    println()

    for(num in 0..20 step 2) {
        print("$num,")
    }
    println()

    for(num in 20 downTo 0 step 2) {
        print("$num,")
    }
    println()

    /**
     * 0 부터 100 까지 범위의 수중에서 3의 배수의 합을 계산하여
     * sum 변수에 담고 결과를 console 출력
     */
    var sum = 0
    // 첫 스타트가 0 또는 3의 배수가 아니면 step 3 을 사용 x
    for(num in 0..100 step 3) {
        sum += num
    }
    println("3의 배수의 합 $sum")

    sum = 0
    for(num in 0..100) {
        if(num % 3 == 0) {
            sum += num
        }
    }
    println("3의 배수의 합 $sum")

}