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
                //"2"를 선택했을 떄 선택구현 3번 처럼 3번째 게임 : 시도 횟수 - 12 구현 못했음.

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