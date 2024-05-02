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
}