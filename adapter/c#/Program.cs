using System;

public class InternalClass {
    public string Fetch() {
        return "get user info_internal";
    }
}

public class ExternalClass {
    public string search() {
        return "get user info_external";
    }
}

public class Adapter {
    private ExternalClass external;

    public Adapter(ExternalClass external) {
        this.external = external;
    }

    public string Fetch() {
        return external.search();
    }

}
class Program {
    static void Main() {
        InternalClass internalClass = new InternalClass();
        ExternalClass externalClass = new ExternalClass();

        Adapter adapter = new Adapter(externalClass);

        Console.WriteLine("internal.fetch(): " + internalClass.Fetch());
        Console.WriteLine("adapter.fetch()" + adapter.Fetch());

    }
}