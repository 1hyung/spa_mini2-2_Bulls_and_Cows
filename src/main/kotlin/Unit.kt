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

// Unit을 attackUnit, takeAttackUnit 구분해서 하려고 했는데 오류나서 하나로 통일
open class Unit(
    var name: String
) {
    fun attack() { // 아무것도 입력 받지 않고 Int 반환 반환타입이 있기 때문에 return으로 반환해야함
        println("$name 공격!")
    }

    open fun hold() {} // 아무것도 입력 받지 않고 반환하지 않는 것, 로직만 실행 되돌려주지 않음

    open fun heal(defensivePower: String): String {  // 입력 받고 반환
        return "체력회복 +10"

    }

    open fun test(something: String) { // 입력 받고 반환하지 않는 것
//        println("입력받은 값: $something")
    }
}

class Marin(
    name: String,
    healthPoints: Int = 35,
    aggressiveStrength: Int = 5,
    defensivePower: Int = 5,
    movingSpeed: Int = 5
) :
    Unit(name) {
    var healthPoints: Int = healthPoints
    var aggressiveStrength: Int = aggressiveStrength
    var defensivePower: Int = defensivePower
    var movingSpeed: Int = movingSpeed
}

class Zealot(
    name: String,
    healthPoints: Int = 33,
    aggressiveStrength: Int = 7,
    defensivePower: Int = 7,
    movingSpeed: Int = 3
) :
    Unit(name) {
    var healthPoints: Int = healthPoints
    var aggressiveStrength: Int = aggressiveStrength
    var defensivePower: Int = defensivePower
    var movingSpeed: Int = movingSpeed
}

class Zergling(
    name: String,
    healthPoints: Int = 25,
    aggressiveStrength: Int = 3,
    defensivePower: Int = 3,
    movingSpeed: Int = 19
) :
    Unit(name) {
    var healthPoints: Int = healthPoints
    var aggressiveStrength: Int = aggressiveStrength
    var defensivePower: Int = defensivePower
    var movingSpeed: Int = movingSpeed
}