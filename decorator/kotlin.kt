open class Coffee {
    open fun cost(): Int = 5
}

open class CoffeeDecorator(private val coffee: Coffee) : Coffee() {
    override fun cost(): Int = coffee.cost()
}

class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Int = super.cost() + 2
}

class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Int = super.cost() + 1
}

fun main() {
    val coffee = Coffee()
    println("Cost of coffee: ${coffee.cost()}")

    val milkCoffee = MilkDecorator(coffee)
    println("Cost of coffee with milk: ${milkCoffee.cost()}")

    val sugarMilkCoffee = SugarDecorator(milkCoffee)
    println("Cost of coffee with milk and sugar: ${sugarMilkCoffee.cost()}")
}
