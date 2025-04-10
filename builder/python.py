class Person:
    def __init__(self):
        self. name = None
        self.age = None
        self.addr = None

class PersonBuilder:
    def __init__(self):
        self.person = Person()
    
    def with_name(self, name):
        self.person.name = name
        return self
    
    def with_age(self, age):
        self.person.age = age
        return self
    
    def with_address(self, addr):
        self.person.addr = addr
        return self
    
    def build(self):
        return self.person
    
# Example usage
if __name__ == "__main__":
    
    person = (PersonBuilder().with_name("John Doe")
                  .with_age(30)
                  .with_address("123 Main St")
                  .build())
    
    print(f"Name: {person.name}, Age: {person.age}, Address: {person.addr}")