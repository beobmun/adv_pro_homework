class InternalClass:
    def fetch(self):
        return "get user info_internal"
    
class ExternalClass:
    def search(self):
        return "get user info_external"
    
class Adapter:
    def __init__(self, external_class):
        self.external_class = external_class
    
    def fetch(self):
        return self.external_class.search()

# Example usage
if __name__ == "__main__":
    internal = InternalClass()
    print(f"internal.fetch(): {internal.fetch()}")  # Output: get user info
    
    external = ExternalClass()
    adapter = Adapter(external)
    print(f"adapter.fetch(): {adapter.fetch()}")  # Output: get user info_external