단계별 코딩
1부터 9까지 배열을 이용해서 할당하고 변수 digits의 mutableList를 shuffle한다. 앞의 세 개의 숫자를 추출하고, 이를 문자열로 변환하여 반환한다.
순서대로 입력값이 세 자리가 아닐 경우, 숫자로만 이루어져 있지 않을 경우, 중복된 숫자가 있는지 확인하고 아니라면 유효하지 않으므로 'false'를 반환합니다.
스트라이크 횟수와 볼 횟수를 기록할 변수 선언, 유저가 입력한 수를 저장할 변수 선언, 몇번만에 게임을 끝내는지 기록할 카운트 선언 및 초기화를 설정합니다. 정답 문자열의 인덱스를 순회하면서 추측과 같은 위치에 있는 숫자를 비교하여 스트라이크인지 확인한다. 동일하게 볼인지 확인한다.
when식을 사용해서 조건에 따라 다른 값을 반환한다. 순서대로 스트라이크가 3개일 때, 스트라이크가 0개 초과, 볼이 0개 초과일 때, 스트라이크만 있을 때, 볼만 있을 때, 이 경우가 아닌 경우 Nothing을 출력한다.
반복문을 이용해서 컴퓨터의 숫자와 내가 입력한 숫자 3개를 비교한다. 자리와 숫자 값 모두 같으면 스트라이크 횟수를 증가시킨다. 자리는 다르지만 숫자갑은 같으면 볼 횟수를 증가시킨다.
3개의 숫자 비교를 끝내고 카운트를 증가시켜 게임을 몇번했는지 기록한다.
스트라이크가 3이면 모두 맞춘 것이므로 while문을 나와서 프로그램을 종료한다. 그 이외는 게임을 못 끝냈으니 반복문을 계속해서 실행한다.
1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기 구현
2. 게임 기록보기 구현
class로 변경, 클래스를 사용하면 게임 관련 기능들을 하나의 객체로 묶어서 관리할 수 있습니다.
private는 접근 제어 지시자 중 하나로, 해당 멤버가 정의된 클래스 내부에서만 접근할 수 있음을 나타낸다. 즉, 클래스 외부에서는 해당 멤버에 접근할 수 없다. 이는 정보 은닉과 캡슐화를 위한 중요한 개념 중 하나인데, 클래스 내부의 세부 구현을 외부에서 숨기고, 외부에서는 오직 공개된 인터페이스만 접근할 수 있도록 제어할 수 있다. 이것은 안전성과 유지 보수성을 높이는 데 도움이 된다.

1부터 9까지 배열을 이용해서 할당하고 변수 digits의 mutableList를 shuffle한다. 앞의 세 개의 숫자를 추출하고, 이를 문자열로 변환하여 반환한다.
        val digits = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        digits.shuffle()
        return digits.take(3).joinToString("")
    }
2. 순서대로 입력값이 세 자리가 아닐 경우, 숫자로만 이루어져 있지 않을 경우, 중복된 숫자가 있는지 확인하고 아니라면 유효하지 않으므로 'false'를 반환합니다. 모든 유효성을 통과했으면 'true'를 반환한다.
    fun isInputValid(input: String): Boolean {
        if (input.length != 3) return false
        if (!input.all { it.isDigit() }) return false
        if (input.toSet().size != 3) return false
        return true
    }

3. 스트라이크 횟수와 볼 횟수를 기록할 변수 선언, 유저가 입력한 수를 저장할 변수 선언, 몇번만에 게임을 끝내는지 기록할 카운트 선언 및 초기화를 설정합니다. 정답 문자열의 인덱스를 순회하면서 추측과 같은 위치에 있는 숫자를 비교하여 스트라이크인지 확인한다. 동일하게 볼인지 확인한다.
    fun getHint(answer: String, guess: String): String {
        var strikes = 0
        var balls = 0

        for (i in answer.indices) {
            if (answer[i] == guess[i]) strikes++
            else if (answer.contains(guess[i])) balls++
        }
4. when식을 사용해서 조건에 따라 다른 값을 반환한다. 순서대로 스트라이크가 3개일 때, 스트라이크가 0개 초과, 볼이 0개 초과일 때, 스트라이크만 있을 때, 볼만 있을 때, 이 경우가 아닌 경우 Nothing을 출력한다.
        return when {
            strikes == 3 -> "정답입니다!"
            strikes > 0 && balls > 0 -> "$strikes 스트라이크 $balls 볼"
            strikes > 0 -> "$strikes 스트라이크"
            balls > 0 -> "$balls 볼"
            else -> "Nothing"
        }
5. 게임이 시작됨을 알리는 메시지를 출력하고. makeAnswer 함수를 호출하여 정답을 생선한다. readLine으로 숫자를 입력받고 만약 isInputValid이 아니라면 "올바르지 않은 입력값입니다"를 출력하고 이어서한다. 정답이라면 break하고 빠져나온다.
    println("< 게임을 시작합니다 >")
    val answer = makeAnswer()

    while (true) {
        print("숫자를 입력하세요: ")
        val input = readLine() ?: ""

        if (!isInputValid(input)) {
            println("올바르지 않은 입력값입니다")
            continue
        }

        val hint = getHint(answer, input)
        println(hint)

        if (hint == "정답입니다!") break
    }
}
6.시도하는 횟수를 저장하는 변수를 추가. ()는 if문의 조건을 정의하는데 사용, 조건식이 true일 때만 {} 내의 코드 실행
() 조건을 지정하는데 사용, {} 조건이 참일 떄 실행할 코드 블록을 정의하는데 사용
  println("< 게임을 시작합니다 >")
    val answer = makeAnswer()
    var tries = 0 // 시도한 횟수 저장하는 변수 추가

    while (true) {
        tries++ // 시도할 때마다 시도 횟수 증가
        print("숫자를 입력하세요: ")
        val input = readLine() ?: ""

        if (!isInputValid(input)) {
            println("올바르지 않은 입력값입니다")
            continue
        }

        val hint = getHint(answer, input)
        println(hint)

        if (hint == "정답입니다!") {
            println("시도한 횟수: $tries") // 정답을 맞추면 시도 횟수 출력
            break
            //()는 if문의 조건을 정의하는데 사용, 조건식이 true일 때만 {} 내의 코드 실행
            //() 조건을 지정하는데 사용, {} 조건이 참일 떄 실행할 코드 블록을 정의하는데 사용
        }
    }
}
필수구현
선택구현
7.코드 뼈대를 참고해서 fun start로 변경
fun main(args: Array<String>) {
    fun makeAnswer(): String {
        val digits = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        digits.shuffle()
        return digits.take(3).joinToString("")
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

        return when {
            strikes == 3 -> "정답입니다!"
            strikes > 0 && balls > 0 -> "$strikes 스트라이크 $balls 볼"
            strikes > 0 -> "$strikes 스트라이크"
            balls > 0 -> "$balls 볼"
            else -> "Nothing"
        }
    }

    fun start() {
        println("< 게임을 시작합니다 >")
        val answer = makeAnswer()
        var tries = 0 // 시도한 횟수 저장하는 변수 추가

        while (true) {
            tries++ // 시도할 때마다 시도 횟수 증가
            print("숫자를 입력하세요 ")
            val input = readLine() ?: ""

            if (!isInputValid(input)) {
                println("올바르지 않은 입력값입니다")
                continue
            }

            val hint = getHint(answer, input)
            println(hint)

            if (hint == "정답입니다!") {
                println("시도한 횟수: $tries") // 정답을 맞추면 시도 횟수 출력
                break
                //()는 if문의 조건을 정의하는데 사용, 조건식이 true일 때만 {} 내의 코드 실행
                //() 조건을 지정하는데 사용, {} 조건이 참일 떄 실행할 코드 블록을 정의하는데 사용
            }
        }
    }
    start()
}
8.1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기 구현
fun main(args: Array<String>) {
    fun makeAnswer(): String {
        val digits = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        digits.shuffle()
        return digits.take(3).joinToString("")
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

        return when {
            strikes == 3 -> "정답입니다!"
            strikes > 0 && balls > 0 -> "$strikes 스트라이크 $balls 볼"
            strikes > 0 -> "$strikes 스트라이크"
            balls > 0 -> "$balls 볼"
            else -> "Nothing"
        }
    }

    fun start() {
        println("환영합니다! 원하시는 번호를 입력해주세요!")
        while (true) {
            println("1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기")
            print("입력: ")
            val input = readLine() ?: ""
            when (input) {
                "1" -> {
                    println("< 게임을 시작합니다 >")
                    val answer = makeAnswer()
                    var tries = 0 // 시도한 횟수 저장하는 변수 추가

                    while (true) {
                        tries++ // 시도할 때마다 시도 횟수 증가
                        print("숫자를 입력하세요 ")
                        val input = readLine() ?: ""

                        if (!isInputValid(input)) {
                            println("올바르지 않은 입력값입니다")
                            continue
                        }

                        val hint = getHint(answer, input)
                        println(hint)

                        if (hint == "정답입니다!") {
                            println("시도한 횟수: $tries") // 정답을 맞추면 시도 횟수 출력
                            break
                            //()는 if문의 조건을 정의하는데 사용, 조건식이 true일 때만 {} 내의 코드 실행
                            //() 조건을 지정하는데 사용, {} 조건이 참일 떄 실행할 코드 블록을 정의하는데 사용
                        }
                    }
                }

                "2" -> {
                    println("게임 기록 보기")
                }

                "3" -> {
                    println("게임을 종료합니다")
                    return
                }

                else -> {
                    println("올바른 번호를 입력해주세요")
                }
            }
        }


    }
    start()
}
9. 2. 게임 기록보기 구현
fun main(args: Array<String>) {
    // 2. 게임 기록 보기 위한 변수 작성
    val gameLogs = mutableListOf<String>()

    fun makeAnswer(): String {
        val digits = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        digits.shuffle()
        return digits.take(3).joinToString("")
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

        return when {
            strikes == 3 -> "정답입니다!"
            strikes > 0 && balls > 0 -> "$strikes 스트라이크 $balls 볼"
            strikes > 0 -> "$strikes 스트라이크"
            balls > 0 -> "$balls 볼"
            else -> "Nothing"
        }
    }

    fun start() {
        println("환영합니다! 원하시는 번호를 입력해주세요!")
        while (true) {
            println("1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기")
            print("입력: ")
            val input = readLine() ?: ""
            when (input) {
                "1" -> {
                    println("< 게임을 시작합니다 >")
                    val answer = makeAnswer()
                    var tries = 0 // 시도한 횟수 저장하는 변수 추가

                    while (true) {
                        tries++ // 시도할 때마다 시도 횟수 증가
                        print("숫자를 입력하세요 ")
                        val input = readLine() ?: ""

                        if (!isInputValid(input)) {
                            println("올바르지 않은 입력값입니다")
                            continue
                        }

                        val hint = getHint(answer, input)
                        println(hint)

                        gameLogs.add(hint)

                        if (hint == "정답입니다!") {
                            println("시도한 횟수: $tries") // 정답을 맞추면 시도 횟수 출력
                            break
                            //()는 if문의 조건을 정의하는데 사용, 조건식이 true일 때만 {} 내의 코드 실행
                            //() 조건을 지정하는데 사용, {} 조건이 참일 떄 실행할 코드 블록을 정의하는데 사용
                        }
                    }
                }

                "2" -> {
                    println("< 게임 기록을 보여줍니다 >")
                    if (gameLogs.isEmpty()) {
                        println("게임 기록이 없습니다.")
                    } else {
                        gameLogs.forEach { println(it) }
                    }
                }

                "3" -> {
                    println("게임을 종료합니다")
                    return
                }

                else -> {
                    println("올바른 번호를 입력해주세요")
                }
            }
        }


    }
    start()
}
