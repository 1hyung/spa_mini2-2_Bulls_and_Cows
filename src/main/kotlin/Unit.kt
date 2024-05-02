package org.example

/*//객체로 이루어진 스타크래프트
open class Unit(
    var name: String
) {
    fun attack() {
        println("${name} 공격!")
        return 5
    }

    fun hold()

    fun heal(defensivePower : String) {
        println("체력 회복: ${defensivePower}")
    }

    fun test(something: String): Int {
        println("입력받은 값:${something}")
        return 5
    }
}

    class Marin(name: String): Unit(name) {
        var healthPoints = 35
        var aggressiveStrength = 5
        var defensivePower = 5
        var movingSpeed = 5
    }


    class Zealot(name: String): Unit(name) {
        var healthPoints = 33
        var aggressiveStrength = 7
        var defensivePower = 7
        var movingSpeed = 3
    }

    class Zergling(name: String): Unit(name) {
        var healthPoints = 25
        var aggressiveStrength = 3
        var defensivePower = 3
        var movingSpeed = 19
    }*/

open class Unit(
    var name: String
) {
    fun attack() {
        println("$name 공격!")
    }

    open fun hold() {
        println("$name 유닛이 대기 중입니다.")
    }

    open fun heal(defensivePower: String) {
        println("체력 회복: $defensivePower")
    }

    open fun test(something: String) { // 입력 받고 반환하지 않는 것
//        println("입력받은 값: $something")

    }
}

class Marin(name: String, healthPoints: Int, aggressiveStrength: Int, defensivePower: Int, movingSpeed: Int) :
    Unit(name) {
    var healthPoints: Int = 35
    var aggressiveStrength: Int = 5
    var defensivePower: Int = 5
    var movingSpeed: Int = 5
}

class Zealot(name: String, healthPoints: Int, aggressiveStrength: Int, defensivePower: Int, movingSpeed: Int) :
    Unit(name) {
    var healthPoints: Int = 33
    var aggressiveStrength: Int = 7
    var defensivePower: Int = 7
    var movingSpeed: Int = 3
}

class Zergling(name: String, healthPoints: Int, aggressiveStrength: Int, defensivePower: Int, movingSpeed: Int) :
    Unit(name) {
    var healthPoints: Int = 25
    var aggressiveStrength: Int = 3
    var defensivePower: Int = 3
    var movingSpeed: Int = 19
}