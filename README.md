# Chapter 2-2. Kotlin 문법 심화 과제 - 숫자 야구 게임

## 기능 요구사항


> 💡 Goal : 나만의 계산기 만들기
>
> - 지금까지 배운 Kotlin 문법을 응용해서 숫자 야구 게임을 만들어봅니다.
> - 변수, 상수 개념을 통한 데이터 효율 관리를 해봅니다.
> - 흐름 제어(반복문, 조건문)을 사용해봅니다.
> - 객체지향 프로그래밍에 대한 이해를 하고 클래스 설계 및 생성자 활용해봅니다.
>

```
 ⚙ features : 필수 구현 기능

 - [ ]  입력과 출력
    - [ ]  입력
        - [ ]  서로 다른 3자리 수
        - [ ]  게임 시작, 기록 보기, 종료를 구분하는 수 입력
            - [ ]  필수 구현에서는 실행 시, 바로 게임 시작
            - [ ]  선택 구현에서 시작, 기록, 종료 구분
    - [ ]  출력
        - [ ]  입력한 수에 대한 결과값을 “볼, 스트라이크, Nothing”으로 표시
- [ ]  요구사항
    - [ ]  1에서 9까지의 서로 다른 임의의 수 3개를 정하고 맞추는 게임입니다
    - [ ]  정답은 랜덤으로 만듭니다.(1에서 9까지의 서로 다른 임의의 수 3자리)
    - [ ]  상세
        - [ ]  정답을 맞추기 위해 3자리수를 입력하고 힌트를 받습니다
            - [ ]  힌트는 야구용어인 **볼**과 **스트라이크**입니다.
            - [ ]  같은 자리에 같은 숫자가 있는 경우 **스트라이크**, 다른 자리에 숫자가 있는 경우 **볼**입니다.
                - ex) 정답 : 456 인 경우
                    - 435를 입력한 경우 → 1스트라이크 1볼
                    - 357를 입력한 경우 → 1스트라이크
                    - 678를 입력한 경우 → 1볼
                    - 123를 입력한 경우 → Nothing
            - [ ]  만약 올바르지 않은 입력값에 대해서는 오류 문구를 보여주세요.
            - [ ]  3자리 숫자가 정답과 같은 경우 게임이 종료됩니다.
            - 실행 예시(정답 : 456)
            < 게임을 시작합니다 >
숫자를 입력하세요
435
1스트라이크 1볼

숫자를 입력하세요
357
1스트라이크

숫자를 입력하세요
123
Nothing

숫자를 입력하세요
dfg // 세 자리 숫자가 아니어서 올바르지 않은 입력값
올바르지 않은 입력값입니다

숫자를 입력하세요
199 // 9가 두번 사용되어 올바르지 않은 입력값
올바르지 않은 입력값입니다

숫자를 입력하세요
103 // 0이 사용되어 올바르지 않은 입력값
올바르지 않은 입력값입니다

숫자를 입력하세요
456
정답입니다!

 😆 features : 선택 구현 기능
 - [ ]  1번
    - [ ]  프로그램을 시작할 때 안내문구를 보여주세요.
    - [ ]  1번 게임 시작하기의 경우 **“필수 구현 기능”** 의 예시처럼 게임이 진행됩니다
    - [ ]  정답을 맞혀 게임이 종료된 경우 위 안내문구를 다시 보여주세요
    // 예시
환영합니다! 원하시는 번호를 입력해주세요
1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기
1 // 1번 게임 시작하기 입력

< 게임을 시작합니다 >
숫자를 입력하세요
.
.
.
    
- [ ]  2번
    - [ ]  정답이 되는 숫자를 0에서 9까지의 서로 다른 3자리의 숫자로 바꿔주세요
        - 맨 앞자리에 0이 오는 것은 불가능합니다
            - 092 → 불가능
            - 870 → 가능
            - 300 → 불가능
          
- [ ]  3번
    - [ ]  실행 시, 2번 게임 기록 보기의 경우 완료한 게임들에 대해 시도 횟수를 보여줍니다.
    // 예시
환영합니다! 원하시는 번호를 입력해주세요
1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기
2 // 2번 게임 기록 보기 입력

< 게임 기록 보기 >
1번째 게임 : 시도 횟수 - 14
2번째 게임 : 시도 횟수 - 9
3번째 게임 : 시도 횟수 - 12
.
.
.

- [ ]  4번
    - [ ]  실행 시, 3번 종료하기의 경우 프로그램이 종료됩니다.
        - 이전의 게임 기록들도 초기화됩니다.
// 예시
환영합니다! 원하시는 번호를 입력해주세요
1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기
3 // 3번 종료하기 입력

< 숫자 야구 게임을 종료합니다 >
        
        - 1, 2, 3 이외의 입력값에 대해서는 오류 메시지를 보여주세요
// 예시
환영합니다! 원하시는 번호를 입력해주세요
1. 게임 시작하기  2. 게임 기록 보기  3. 종료하기
4

올바른 숫자를 입력해주세요!         
          

```

## 기능

### 사용자(User) 기능
1. 숫자 1 ~ 9를 입력해서 숫자 게임을 할 수 있습니다.
2. 3스트라이크를 달성하면 "정답입니다"와 시도한 횟수를 알려주고 게임이 종료됩니다.
2. 입력을 잘못할 경우 "올바르지 않은 입력값입니다"를 출력하고 게임을 진행합니다.
3.  실행하면 "<게임을 시작합니다>"라는 입력과 함께 '1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기 선택할 수 있습니다.

### 관리자(Admin) 기능
1. 차후 추가될 예정입니다.

## 단계별 구현 (필수 1 ~ 6, 선택 7 ~ 8)
1. 1부터 9까지 배열을 이용해서 할당하고 변수 digits의 mutableList를 shuffle한다. 앞의 세 개의 숫자를 추출하고, 이를 문자열로 변환하여 반환한다.
2. 순서대로 입력값이 세 자리가 아닐 경우, 숫자로만 이루어져 있지 않을 경우, 중복된 숫자가 있는지 확인하고 아니라면 유효하지 않으므로 'false'를 반환합니다.
3. 스트라이크 횟수와 볼 횟수를 기록할 변수 선언, 유저가 입력한 수를 저장할 변수 선언, 몇번만에 게임을 끝내는지 기록할 카운트 선언 및 초기화를 설정합니다. 정답 문자열의 인덱스를 순회하면서 추측과 같은 위치에 있는 숫자를 비교하여 스트라이크인지 확인한다. 동일하게 볼인지 확인한다.
4. when식을 사용해서 조건에 따라 다른 값을 반환한다. 순서대로 스트라이크가 3개일 때, 스트라이크가 0개 초과, 볼이 0개 초과일 때, 스트라이크만 있을 때, 볼만 있을 때, 이 경우가 아닌 경우 Nothing을 출력한다.
5. 반복문을 이용해서 컴퓨터의 숫자와 내가 입력한 숫자 3개를 비교한다. 자리와 숫자 값 모두 같으면 스트라이크 횟수를 증가시킨다. 자리는 다르지만 숫자갑은 같으면 볼 횟수를 증가시킨다.
6. 3개의 숫자 비교를 끝내고 카운트를 증가시켜 게임을 몇번했는지 기록한다.
7. 스트라이크가 3이면 모두 맞춘 것이므로 while문을 나와서 프로그램을 종료한다. 그 이외는 게임을 못 끝냈으니 반복문을 계속해서 실행한다.
8. '1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기 구현
9. '2. 게임 기록보기 구현

### 필수구현
<details>
<summary>각 단계 코드 보기</summary>
<div markdown="1">

1. 1부터 9까지 배열을 이용해서 할당하고 변수 digits의 mutableList를 shuffle한다. 앞의 세 개의 숫자를 추출하고, 이를 문자열로 변환하여 반환한다.
```
val digits = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
digits.shuffle()
return digits.take(3).joinToString("")
}
```
2. 순서대로 입력값이 세 자리가 아닐 경우, 숫자로만 이루어져 있지 않을 경우, 중복된 숫자가 있는지 확인하고 아니라면 유효하지 않으므로 'false'를 반환합니다. 모든 유효성을 통과했으면 'true'를 반환한다.
```
 fun isInputValid(input: String): Boolean {
   if (input.length != 3) return false
   if (!input.all { it.isDigit() }) return false
   if (input.toSet().size != 3) return false
   return true
   }
```
3. 스트라이크 횟수와 볼 횟수를 기록할 변수 선언, 유저가 입력한 수를 저장할 변수 선언, 몇번만에 게임을 끝내는지 기록할 카운트 선언 및 초기화를 설정합니다. 정답 문자열의 인덱스를 순회하면서 추측과 같은 위치에 있는 숫자를 비교하여 스트라이크인지 확인한다. 동일하게 볼인지 확인한다.
```
 fun getHint(answer: String, guess: String): String {
   var strikes = 0
   var balls = 0

        for (i in answer.indices) {
            if (answer[i] == guess[i]) strikes++
            else if (answer.contains(guess[i])) balls++
        }
```
4. when식을 사용해서 조건에 따라 다른 값을 반환한다. 순서대로 스트라이크가 3개일 때, 스트라이크가 0개 초과, 볼이 0개 초과일 때, 스트라이크만 있을 때, 볼만 있을 때, 이 경우가 아닌 경우 Nothing을 출력한다.
```
return when {
   strikes == 3 -> "정답입니다!"
   strikes > 0 && balls > 0 -> "$strikes 스트라이크 $balls 볼"
   strikes > 0 -> "$strikes 스트라이크"
   balls > 0 -> "$balls 볼"
   else -> "Nothing"
   }
```
5. 게임이 시작됨을 알리는 메시지를 출력하고. makeAnswer 함수를 호출하여 정답을 생선한다. readLine으로 숫자를 입력받고 만약 isInputValid이 아니라면 "올바르지 않은 입력값입니다"를 출력하고 이어서한다. 정답이라면 break하고 빠져나온다.
 ```  
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
```
6. 시도하는 횟수를 저장하는 변수를 추가. ()는 if문의 조건을 정의하는데 사용, 조건식이 true일 때만 {} 내의 코드 실행
   () 조건을 지정하는데 사용, {} 조건이 참일 떄 실행할 코드 블록을 정의하는데 사용
```
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
``` 

</div>
</details>

###   선택구현
<details>
<summary>각 단계 코드 보기</summary>
<div markdown="1">


7. 코드 뼈대를 참고해서 fun start로 변경
```
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
 ```
8. '1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기 구현
```
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
```
9. '2. 게임 기록보기 구현
```
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
```

</div>
</details>
