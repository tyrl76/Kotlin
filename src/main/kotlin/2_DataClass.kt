data class Person(val name: String, val age: Int)

fun main() {
    val person1 = Person(name = "tony", age = 12)
//    val person2 = Person(name = "tony", age = 12)
//    println(person1.toString())

    val person2 = person1.copy(name= "strange")
    println(person2)

    println("이름=${person1.component1()}, 나이=${person1.component2()}")

    val (name, age) = person1
    println("이름=${name}, 나이=${age}")

//    println(person1 == person2)
//
    val set = hashSetOf(person1)
    println(set.contains(person1))

//    person1.name = "strange"
//    println(set.contains(person1))

}

