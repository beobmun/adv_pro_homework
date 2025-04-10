using System;

public abstract class Animal {
    public abstract string Speak();
}

public class Dog : Animal {
    public override string Speak() {
        return "Woof!";
    }
}

public class Cat : Animal {
    public override string Speak() {
        return "Meow!";
    }
}

public class AnimalFactory {
    public Animal CreateAnimal(string animalType) {
        if (animalType == "dog") {
            return new Dog();
        } else if (animalType == "cat") {
            return new Cat();
        } else {
            throw new ArgumentException("Unknown animal type");
        }
    }
}

class Program {
    static void Main() {
        var factory = new AnimalFactory();

        Animal dog = factory.CreateAnimal("dog");
        Console.WriteLine(dog.Speak());

        Animal cat = factory.CreateAnimal("cat");
        Console.WriteLine(cat.Speak());
    }
}
