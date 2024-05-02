import kotlin.random.Random
//참고코드
fun main(args: Array<String>) {
    fun makeAnswer(): String {
        val digits = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        digits.shuffle()
        return digits.take(3).joinToString("")
    }

    fun isInputValid(input: String): Boolean {
        if (input.length != 3) return false
        if (!input.all { it.isDigit() }) return false
        if (input.toSet().size != 3) return false
        return true
    }

    fun getHint(answer: String, guess: String): String {
        var strikes = 0
        var balls = 0

        for (i in answer.indices) {
            if (answer[i] == guess[i]) strikes++
            else if (answer.contains(guess[i])) balls++
        }

        return when {
            strikes == 3 -> "정답입니다!"
            strikes > 0 && balls > 0 -> "$strikes 스트라이크 $balls 볼"
            strikes > 0 -> "$strikes 스트라이크"
            balls > 0 -> "$balls 볼"
            else -> "Nothing"
        }
    }

    println("< 게임을 시작합니다 >")
    val answer = makeAnswer()

    while (true) {
        print("숫자를 입력하세요: ")
        val input = readLine() ?: ""

        if (!isInputValid(input)) {
            println("올바르지 않은 입력값입니다")
            continue
        }

        val hint = getHint(answer, input)
        println(hint)

        if (hint == "정답입니다!") break
    }
}
