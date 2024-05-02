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
}