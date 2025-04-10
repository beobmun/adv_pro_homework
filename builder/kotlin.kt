class Person {
    var name: String? = null
    var age: Int? = null
    var address: String? = null
}

class PersonBuilder {
    private val person = Person()

    fun withName(name: String): PersonBuilder {
        person.name = name
        return this
    }

    fun withAge(personAge: Int): PersonBuilder {
        person.age = personAge
        return this
    }

    fun withAddress(newAddress: String): PersonBuilder {
        person.address = newAddress
        return this
    }

    fun build(): Person {
        return person
    }
}

fun main() {
    val person = PersonBuilder()
        .withName("John Doe")
        .withAge(30)
        .withAddress("123 Main St")
        .build()

    println("Name: ${person.name}, Age: ${person.age}, Address: ${person.address}")
}
