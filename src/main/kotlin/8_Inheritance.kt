open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

//class Bulldog: Dog() {
//
//    override var age : Int = 0
//
//    override fun bark() {
//        println("컹컹")
//    }
//}

open class Bulldog(override var age : Int = 0): Dog() {

    override fun bark() { // final: override 방지
        println("컹컹")
    }
}

class ChildBulldog: Bulldog() {

    override var age: Int = 0

    override fun bark() {
        super.bark()
    }
}

abstract class Developer {

    abstract var age: Int
    abstract fun code(language: String)

}

class BackendDeveloper(override var age: Int): Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }

}

fun main() {

    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")

//    val dog = Bulldog(age = 2)
//    println(dog.age)
//    dog.bark()
}