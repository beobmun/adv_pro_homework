#include <iostream>
#include <string>

using namespace std;

class InternalClass {
    public:
        string fetch() {
        return "get user info_internal";
    }
};

class ExternalClass {
    public:
        string search() {
        return "get user info_external";
    }
};

class Adapter {
    private:
        ExternalClass *external;
    public:
        Adapter(ExternalClass *ext) : external(ext) {}

        string fetch() {
            return external->search();
        }
};

int main() {
    InternalClass internal;
    ExternalClass external;
    Adapter adapter(&external);

    cout << "internal.fetch(): " << internal.fetch() << endl;
    cout << "adapter.fetch(): " << adapter.fetch() << endl;

    return 0;
}