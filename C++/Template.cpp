#include <iostream>
#include <type_traits>
#include <cstring>

template <typename T>
class MyClass {
public:
    T add(T a, T b) {
        return a + b;
    }

    T subtract(T a, T b) {
        return a - b;
    }

    T multiply(T a, T b) {
        return a * b;
    }
};

// Template specialization for char type
template <>
class MyClass<char> {
public:
    char process(char a, char b, char choice) {
        if (std::isupper(a) && std::isupper(b) && choice == 'C') {
            return std::tolower(a);
        } else if (std::islower(a) && std::islower(b) && choice == 'C') {
            return std::toupper(a);
        } else if (choice == 'C') {
            return std::toupper(a);
        } else if (choice == 'c') {
            return std::tolower(a);
        } else if (choice == 'C' || choice == 'c') {
            return std::toupper(a);
        } else {
            char result[3] = {a, ' ', b};
            return *result;
        }
    }
};

int main() {
    MyClass<int> intCalc;
    MyClass<float> floatCalc;
    MyClass<double> doubleCalc;
    MyClass<char> charCalc;

    int intSum = intCalc.add(5, 3);
    std::cout << "5 + 3 = " << intSum << std::endl;

    float floatProduct = floatCalc.multiply(2.5f, 3.0f);
    std::cout << "2.5 * 3.0 = " << floatProduct << std::endl;

    double doubleDiff = doubleCalc.subtract(10.5, 3.2);
    std::cout << "10.5 - 3.2 = " << doubleDiff << std::endl;

    char a = 'a';
    char b = 'B';
    char choice = 'C';
    char result = charCalc.process(a, b, choice);
    std::cout << "Processed char: " << result << std::endl;

    return 0;
}
