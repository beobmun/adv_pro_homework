#include <iostream>
#include <string>

using namespace std;

class Person {
public:
    string name;
    int age;
    string addr;
};

class PersonBuilder {
private:
    Person person;

public:
    PersonBuilder& withName(const string& name) {
        person.name = name;
        return *this;
    }

    PersonBuilder& withAge(int age) {
        person.age = age;
        return *this;
    }

    PersonBuilder& withAddress(const string& addr) {
        person.addr = addr;
        return *this;
    }

    Person build() {
        return person;
    }
};

int main() {
    Person person = PersonBuilder()
                        .withName("John Doe")
                        .withAge(30)
                        .withAddress("123 Main St")
                        .build();

    cout << "Name: " << person.name 
        << ", Age: " << person.age 
        << ", Address: " << person.addr << endl;

    return 0;
}
