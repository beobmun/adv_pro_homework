using System;

public class Coffee {
    public virtual int Cost() {
        return 5;
    }
}

public class CoffeeDecorator : Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public override int Cost() {
        return coffee.Cost();
    }
}

public class MilkDecorator : CoffeeDecorator {
    public MilkDecorator(Coffee coffee) : base(coffee) {}

    public override int Cost() {
        return base.Cost() + 2;
    }
}

public class SugarDecorator : CoffeeDecorator {
    public SugarDecorator(Coffee coffee) : base(coffee) {}

    public override int Cost() {
        return base.Cost() + 1;
    }
}

class Program {
    static void Main() {
        Coffee coffee = new Coffee();
        Console.WriteLine("Cost of coffee: " + coffee.Cost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        Console.WriteLine("Cost of coffee with milk: " + milkCoffee.Cost());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        Console.WriteLine("Cost of coffee with milk and sugar: " + sugarMilkCoffee.Cost());
    }
}
