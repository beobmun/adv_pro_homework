#include <iostream>
#include <memory>

using namespace std;

class Coffee {
public:
    virtual int cost() const {
        return 5;
    }

    virtual ~Coffee() = default;
};

class CoffeeDecorator : public Coffee {
protected:
    shared_ptr<Coffee> coffee;
public:
    CoffeeDecorator(shared_ptr<Coffee> c) : coffee(c) {}
    int cost() const override {
        return coffee->cost();
    }
};

class MilkDecorator : public CoffeeDecorator {
public:
    MilkDecorator(shared_ptr<Coffee> c) : CoffeeDecorator(c) {}
    int cost() const override {
        return coffee->cost() + 2;
    }
};

class SugarDecorator : public CoffeeDecorator {
public:
    SugarDecorator(shared_ptr<Coffee> c) : CoffeeDecorator(c) {}
    int cost() const override {
        return coffee->cost() + 1;
    }
};

int main() {
    shared_ptr<Coffee> coffee = make_shared<Coffee>();
    cout << "Cost of coffee: " << coffee->cost() << endl;

    shared_ptr<Coffee> milkCoffee = make_shared<MilkDecorator>(coffee);
    cout << "Cost of coffee with milk: " << milkCoffee->cost() << endl;

    shared_ptr<Coffee> sugarMilkCoffee = make_shared<SugarDecorator>(milkCoffee);
    cout << "Cost of coffee with milk and sugar: " << sugarMilkCoffee->cost() << endl;

    return 0;
}
