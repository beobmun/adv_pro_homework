#include <iostream>
#include <stdexcept>

using namespace std;

class Calculator {
private:
    double result = 0;

public:
    Calculator& add(double value) {
        result += value;
        return *this;
    }

    Calculator& subtract(double value) {
        result -= value;
        return *this;
    }

    Calculator& multiply(double value) {
        result *= value;
        return *this;
    }

    Calculator& divide(double value) {
        if (value != 0) {
            result /= value;
        } else {
            throw runtime_error("Cannot divide by zero.");
        }
        return *this;
    }

    double get_result() const {
        return result;
    }
};

int main() {
    Calculator calc;
    double result = calc.add(5)
                        .subtract(2)
                        .multiply(3)
                        .divide(2)
                        .get_result();

    cout << "Result: " << result << endl; // Output: 4.5
    return 0;
}
