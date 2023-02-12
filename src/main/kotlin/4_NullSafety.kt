import java.lang.NullPointerException

//fun main() {
//
////    val a : String = null
////    var b : String = "aabbcc"
////    b = null
//
//    var a : String? = null
//    println(a?.length)
//
//    val b : Int = if (a != null) a.length else 0
//    println(b)
//
//    // 엘비스 연산자 (좌변이 null인 경우 우변을 리턴)
//    val c = a?.length ?: 0
//    println(c)
//}

fun getNullStr() : String? = null

fun getLengthIfNotNull(str: String?) = str?.length ?: 0

fun main() {

    val nullableStr = getNullStr()

    val nullableStrLength = nullableStr?.length ?: "null인 경우 반환".length
    println(nullableStrLength)

    val length = getLengthIfNotNull(null)
    println(length)

    //throw NullPointerException()

//    val c: String? = null
//    val d = c!!.length



}