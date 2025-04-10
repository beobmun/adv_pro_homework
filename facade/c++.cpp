#include <iostream>

using namespace std;

class CPU {
public:
    void process() {
        cout << "CPU processing..." << endl;
    }
};

class Memory {
public:
    void load() {
        cout << "Memory loading..." << endl;
    }
};

class SSD {
public:
    void read() {
        cout << "SSD reading..." << endl;
    }
};

class ComputerFacade {
private:
    CPU cpu;
    Memory memory;
    SSD ssd;

public:
    void boot() {
        cout << "Booting up the computer..." << endl;
        ssd.read();
        memory.load();
        cpu.process();
        cout << "Computer booted successfully!" << endl;
    }
};

int main() {
    ComputerFacade computer;
    computer.boot();
    return 0;
}
