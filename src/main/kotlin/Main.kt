package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}*/
fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭")
    var sparrow = Sparrow("참새")
    var pigeon = Pigeon("비둘기")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird(
    var name: String
) {
    fun fly() {
        println("${name} 날아요~")
    }

}

class Chicken(name: String) : Bird(name) {

}

class Sparrow(name: String) : Bird(name) {

}

class Pigeon(name: String) : Bird(name) {

}


