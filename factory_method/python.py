class Animal:
    def speak(self):
        pass

class Dog(Animal):
    def speak(self):
        return "Woof!"

class Cat(Animal):
    def speak(self):
        return "Meow!"

class AnimalFactory:
    def create_animal(self, animal_type):
        if animal_type == "dog":
            return Dog()
        elif animal_type == "cat":
            return Cat()
        else:
            raise ValueError("Unknown animal type")
        return None

# Example usage
if __name__ == "__main__":
    factory = AnimalFactory()
    
    dog = factory.create_animal("dog")
    print(dog.speak())  # Output: Woof!
    
    cat = factory.create_animal("cat")
    print(cat.speak())  # Output: Meow!