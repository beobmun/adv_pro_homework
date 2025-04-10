using System;

public class Calculator {
    private double result = 0;

    public Calculator Add(double value) {
        result += value;
        return this;
    }

    public Calculator Subtract(double value) {
        result -= value;
        return this;
    }

    public Calculator Multiply(double value) {
        result *= value;
        return this;
    }

    public Calculator Divide(double value) {
        if (value != 0) {
            result /= value;
        } else {
            throw new ArgumentException("Cannot divide by zero.");
        }
        return this;
    }

    public double GetResult() {
        return result;
    }
}

class Program {
    static void Main() {
        Calculator calc = new Calculator();
        double result = calc.Add(5)
                            .Subtract(2)
                            .Multiply(3)
                            .Divide(2)
                            .GetResult();

        Console.WriteLine("Result: " + result); // Output: 4.5
    }
}
