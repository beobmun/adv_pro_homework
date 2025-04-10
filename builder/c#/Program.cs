using System;

public class Person
{
    public string Name;
    public int Age;
    public string Address;
}

public class PersonBuilder
{
    private Person person = new Person();

    public PersonBuilder WithName(string name)
    {
        person.Name = name;
        return this;
    }

    public PersonBuilder WithAge(int age)
    {
        person.Age = age;
        return this;
    }

    public PersonBuilder WithAddress(string address)
    {
        person.Address = address;
        return this;
    }

    public Person Build()
    {
        return person;
    }
}

class Program
{
    static void Main()
    {
        Person person = new PersonBuilder()
                            .WithName("John Doe")
                            .WithAge(30)
                            .WithAddress("123 Main St")
                            .Build();

        Console.WriteLine($"Name: {person.Name}, Age: {person.Age}, Address: {person.Address}");
    }
}
