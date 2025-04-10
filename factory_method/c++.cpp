#include <iostream>
#include <memory>
#include <string>

using namespace std;

// Product 인터페이스
class Animal {
public:
    virtual string speak() const = 0;
    virtual ~Animal() = default;
};

// 구체 클래스
class Dog : public Animal {
public:
    string speak() const override {
        return "Woof!";
    }
};

class Cat : public Animal {
public:
    string speak() const override {
        return "Meow!";
    }
};

// Factory 클래스
class AnimalFactory {
public:
    shared_ptr<Animal> createAnimal(const string& animalType) {
        if (animalType == "dog") {
            return make_shared<Dog>();
        } else if (animalType == "cat") {
            return make_shared<Cat>();
        } else {
            throw runtime_error("Unknown animal type");
        }
    }
};

int main() {
    AnimalFactory factory;

    auto dog = factory.createAnimal("dog");
    cout << dog->speak() << endl;

    auto cat = factory.createAnimal("cat");
    cout << cat->speak() << endl;

    return 0;
}
