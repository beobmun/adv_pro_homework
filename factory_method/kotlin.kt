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
        return when {
            type.equals("dog", ignoreCase = true) -> Dog()
            type.equals("cat", ignoreCase = true) -> Cat()
            else -> throw IllegalArgumentException("Unknown animal type: $type")
        }
    }
}

fun main() {
    val factory = AnimalFactory()

    val dog = factory.createAnimal("DOG")
    println(dog.speak())  // Output: Woof!

    val cat = factory.createAnimal("Cat")
    println(cat.speak())  // Output: Meow!
}
