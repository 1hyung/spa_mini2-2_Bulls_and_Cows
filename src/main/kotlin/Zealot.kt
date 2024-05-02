import org.example.Zealot

class Zealot(
    val hp: Int,
    var atp: Int
) {
    fun walk(){
        println("걷는 중")
    }
    //마린한테 공격당했다.
    fun marinDamage(marin: Marin) {
        hp - marin.atp
    }
    //저글링한테 공격당했다.
    fun zerglingDamage(zergling: Zergling) {
        hp - zergling.atp
    }
}