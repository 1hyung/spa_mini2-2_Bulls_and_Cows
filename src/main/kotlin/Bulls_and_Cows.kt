fun main() {
    fun makeAnswer() {
        val numbers = mutableListOf(1..9)
        numbers.shuffle()
        return numbers.take(3).joinToString(" ")
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

