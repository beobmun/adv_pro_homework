using System;

public class CPU {
    public void Process() {
        Console.WriteLine("CPU processing...");
    }
}

public class Memory {
    public void Load() {
        Console.WriteLine("Memory loading...");
    }
}

public class SSD {
    public void Read() {
        Console.WriteLine("SSD reading...");
    }
}

public class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private SSD ssd = new SSD();

    public void Boot() {
        Console.WriteLine("Booting up the computer...");
        ssd.Read();
        memory.Load();
        cpu.Process();
        Console.WriteLine("Computer booted successfully!");
    }
}

class Program {
    static void Main(string[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.Boot();
    }
}
