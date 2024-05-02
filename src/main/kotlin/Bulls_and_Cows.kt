fun main() {
    fun makeAnswer() {
        val numbers = mutableListOf(1..9)
        numbers.shuffle()
        return numbers.take(3).joinToString(" ")
    }
}