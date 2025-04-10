class Calculator:
    def __init__(self):
        self.result = 0
        
    def add(self, value):
        self.result += value
        return self

    def subtract(self, value):
        self.result -= value
        return self

    def multiply(self, value):
        self.result *= value
        return self

    def divide(self, value):
        if value != 0:
            self.result /= value
        else:
            raise ValueError("Cannot divide by zero.")
        return self

    def get_result(self):
        return self.result

# Example usage
if __name__ == "__main__":
    calculator = Calculator()
    
    result = (calculator.add(5)
                     .subtract(2)
                     .multiply(3)
                     .divide(2)
                     .get_result())
    
    print(result)  # Output: 4.5