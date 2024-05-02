package org.example

/*fun main() {
    var unit = Unit("유닛")
    var zealot = Zealot("질럿")
    var zergling = Zergling("저글링")
    var marin = Marin("마린")

    var Fenix = Zealot(100, 14, 14, 6)
    var DevouringOne = Zergling(70, 6, 6, 38)
    var JimRaynor = Marin(100, 10, 10, 10)


    unit.attack()
    marin.attack()
    zergling.attack()
    zealot.attack()

    unit.hold()
    marin.hold()
    zergling.hold()
    zealot.hold()

    unit.heal(defensivePower : String)
    marin.heal(defensivePower : String)
    zergling.heal(defensivePower : String)
    zealot.heal(defensivePower : String)

    unit.test(something: String)
    marin.test(something: String)
    zergling.test(something: String)
    zealot.test(something: String)
}*/

fun main() { // 특정값만 내가 원하는 대로 넣을 수 있음! , 다리 없는 사자 내가 원하는 다리를 추가할 수 있음!

    val unit = Unit("유닛")
    val zealot = Zealot("질럿")
    val zergling = Zergling("저글링")
    val marin = Marin("마린")

    val fenix = Zealot("피닉스", 100, 14, 14, 6)
    val devouringOne = Zergling("디보어링원", 70, 6, 6, 38)
    val jimRaynor = Marin("짐 레이너", 100, 10, 10, 10)

    unit.attack()
    marin.attack()
    zergling.attack()
    zealot.attack()
    fenix.attack()
    devouringOne.attack()
    jimRaynor.attack()


    unit.hold()
    marin.hold()
    zergling.hold()
    zealot.hold()
    fenix.attack()
    devouringOne.attack()
    jimRaynor.attack()


    unit.heal("Heal") // defensivePower에 문자열 전달
    marin.heal("Heal") // defensivePower에 문자열 전달
    zergling.heal("Heal") // defensivePower에 문자열 전달
    zealot.heal("Heal") // defensivePower에 문자열 전달
    fenix.heal("Heal") // defensivePower에 문자열 전달
    devouringOne.heal("Heal") // defensivePower에 문자열 전달
    jimRaynor.heal("Heal") // defensivePower에 문자열 전달


    unit.test("someString")
    marin.test("someString")
    zergling.test("someString")
    zealot.test("someString")
    fenix.test("someString")
    devouringOne.test("someString")
    jimRaynor.test("someString")
}

//main
//val a = 객체생성()
객체끼리 관계를 지어주고싶다?
        객체끼리 연관을 짓고싶다
-> 매개변수로 객체를 넘긴다.
        A -> 회원
        B -> 게시판

        특정 회원이 작성한 게시판
        fun eat(food: String) {
            print("나는 ${food} 먹는다.")
        }
class Food {
    var foodName: String = "음식이름"

    fun giveFood() : String{
        return foodName
    }
}

fun main() {
    val zergling = Zergling(   1,3,4)
    val food = Food( )

}



