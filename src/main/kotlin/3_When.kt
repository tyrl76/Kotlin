fun main() {

    // 자바 코드를 코틀린의 when식으로 변환한 코드
    val day = 2

    val result = when (day) {
        1 -> "월"
        2 -> "화"
        3 -> "수"
        4 -> "목"
        else -> "기타"
    }
    println(result)

    // else를 생략할 수 있다
    when(getColor()) {
        Color.RED -> print("RED")
        Color.GREEN -> print("GREEN")
        else -> print("BLUE")
    }

    // 여러개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다
    when (getNumber()) {
        0, 1 -> print("0 or 1")
        else -> print("0 or 1 아님")
    }

}

enum class Color {
    RED, GREEN, BLUE
}

fun getColor() = Color.RED

fun getNumber() = 2