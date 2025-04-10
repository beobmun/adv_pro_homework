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
        val normalizedType = safeLowercase(type)

        return when (normalizedType) {
            "dog" -> Dog()
            "cat" -> Cat()
            else -> throw IllegalArgumentException("Unknown animal type")
        }
    }

    private fun safeLowercase(input: String): String {
        return try {
            // Kotlin 1.5+ lowercase()
            val method = String::class.java.getMethod("lowercase")
            method.invoke(input) as String
        } catch (_: NoSuchMethodException) {
            try {
                // Kotlin 1.5+ lowercase(Locale)
                val method = String::class.java.getMethod("lowercase", Locale::class.java)
                method.invoke(input, Locale.getDefault()) as String
            } catch (_: NoSuchMethodException) {
                // Kotlin 1.4 fallback (deprecated but suppressed)
                @Suppress("DEPRECATION")
                return input.toLowerCase(Locale.getDefault())
            }
        }
    }
}

fun main() {
    val factory = AnimalFactory()

    val dog = factory.createAnimal("DOG")
    println(dog.speak())

    val cat = factory.createAnimal("Cat")
    println(cat.speak())
}
