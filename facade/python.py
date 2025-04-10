class CPU:
    def process(self):
        print("CPU processing...")
        
class Memory:
    def load(self):
        print("Memory loading...")

class SSD:
    def read(self):
        print("SSD reading...")

class ComputerFacade:
    def __init__(self):
        self.cpu = CPU()
        self.memory = Memory()
        self.ssd = SSD()
        
    def boot(self):
        print("Booting up the computer...")
        self.ssd.read()
        self.memory.load()
        self.cpu.process()
        print("Computer booted successfully!")
        
# Example usage
if __name__ == "__main__":
    computer = ComputerFacade()
    computer.boot()