import java.util.Locale

abstract class Animal {
    abstract fun speak(): String
}

class Dog : Animal() {
    override fun speak(): String = "Woof!"
}

class Cat : Animal() {
    override fun speak(): String = "Meow!"
}

class AnimalFactory {
    fun createAnimal(type: String): Animal {
        return when (type.toLowerCase()) {
            "dog" -> Dog()
            "cat" -> Cat()
            else -> throw IllegalArgumentException("Unknown animal type")
        }
    }
}

fun main() {
    val factory = AnimalFactory()

    val dog = factory.createAnimal("dog")
    println(dog.speak())

    val cat = factory.createAnimal("cat")
    println(cat.speak())
}
