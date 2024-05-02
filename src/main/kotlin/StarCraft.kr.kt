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
fun main() {
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

    unit.hold()
    marin.hold()
    zergling.hold()
    zealot.hold()

    unit.heal("somePower") // defensivePower에 문자열 전달
    marin.heal("somePower") // defensivePower에 문자열 전달
    zergling.heal("somePower") // defensivePower에 문자열 전달
    zealot.heal("somePower") // defensivePower에 문자열 전달

    unit.test("someString")
    marin.test("someString")
    zergling.test("someString")
    zealot.test("someString")
}