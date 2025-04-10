class CPU {
    fun process() {
        println("CPU processing...")
    }
}

class Memory {
    fun load() {
        println("Memory loading...")
    }
}

class SSD {
    fun read() {
        println("SSD reading...")
    }
}

class ComputerFacade {
    private val cpu = CPU()
    private val memory = Memory()
    private val ssd = SSD()

    fun boot() {
        println("Booting up the computer...")
        ssd.read()
        memory.load()
        cpu.process()
        println("Computer booted successfully!")
    }
}

fun main() {
    val computer = ComputerFacade()
    computer.boot()
}
