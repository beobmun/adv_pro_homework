class Coffee:
    def cost(self):
        return 5
    
class CoffeeDecorator:
    def __init__(self, coffee):
        self._coffee = coffee
    
    def cost(self):
        return self._coffee.cost()

class MilkDecorator(CoffeeDecorator):
    def cost(self):
        return self._coffee.cost() + 2

class SugarDecorator(CoffeeDecorator):
    def cost(self):
        return self._coffee.cost() + 1

# Example usage
if __name__ == "__main__":
    coffee = Coffee()
    print(f"Cost of coffee: {coffee.cost()}")  # Output: 5
    
    milk_coffee = MilkDecorator(coffee)
    print(f"Cost of coffee with milk: {milk_coffee.cost()}")  # Output: 7
    
    sugar_milk_coffee = SugarDecorator(milk_coffee)
    print(f"Cost of coffee with milk and sugar: {sugar_milk_coffee.cost()}")  # Output: 8