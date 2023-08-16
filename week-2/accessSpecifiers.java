public class accessSpecifiers {
    public static void main(String[] args) {
        PublicExample publicExample = new PublicExample();
        publicExample.publicField = 10;
        publicExample.publicMethod();
        
        PrivateExample privateExample = new PrivateExample();
        // The following lines would result in compilation errors because private members are not accessible.
        // privateExample.privateField = 20;
        // privateExample.privateMethod();
        
        ProtectedExample protectedExample = new ProtectedExample();
        protectedExample.protectedField = 30;
        protectedExample.protectedMethod();
        
        DefaultExample defaultExample = new DefaultExample();
        defaultExample.defaultField = 40;
        defaultExample.defaultMethod();
    }
}


// PublicExample.java
public class PublicExample {
    public int publicField;
    
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
}

// PrivateExample.java
class PrivateExample {
    private int privateField;
    
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

// ProtectedExample.java
class ProtectedExample {
    protected int protectedField;
    
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}

// DefaultExample.java
class DefaultExample {
    int defaultField; // Package-private access
    
    void defaultMethod() { // Package-private access
        System.out.println("This is a default method.");
    }
}

