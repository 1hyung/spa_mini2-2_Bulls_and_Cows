import org.example.Zealot

class Marin(
    val hp: Int,
    var atp: Int
) {
    //저글링한테 공격당했다.
    fun zerglingDamage(zergling: Zergling) {
        hp - zergling.atp
    }
    //질럿한테 공격당했다.
    fun zealotDamage(zealot: Zealot) {
        hp - zealot.atp
    }
}