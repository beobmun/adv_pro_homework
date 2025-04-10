class Calculator {
    private var result: Double = 0.0

    fun add(value: Double): Calculator {
        result += value
        return this
    }

    fun subtract(value: Double): Calculator {
        result -= value
        return this
    }

    fun multiply(value: Double): Calculator {
        result *= value
        return this
    }

    fun divide(value: Double): Calculator {
        if (value != 0.0) {
            result /= value
        } else {
            throw IllegalArgumentException("Cannot divide by zero.")
        }
        return this
    }

    fun getResult(): Double {
        return result
    }
}

fun main() {
    val calculator = Calculator()
    val result = calculator
        .add(5.0)
        .subtract(2.0)
        .multiply(3.0)
        .divide(2.0)
        .getResult()

    println("Result: $result") // Output: 4.5
}
