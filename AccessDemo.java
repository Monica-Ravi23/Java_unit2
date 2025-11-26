// File: AccessDemo.java
// Class with members using different access specifiers

class Person {

    public String name = "Alice";       // Accessible everywhere
    private int age = 25;               // Accessible only inside Person
    protected String city = "Bengaluru"; // Accessible in same package or subclass
    String country = "India";           // Default access: package-private

    public void showPublic() {
        System.out.println("Public Method: Name = " + name);
    }

    private void showPrivate() {
        System.out.println("Private Method: Age = " + age);
    }

    protected void showProtected() {
        System.out.println("Protected Method: City = " + city);
    }

    void showDefault() {
        System.out.println("Default Method: Country = " + country);
    }

    // Public method accessing a private member internally
    public void accessPrivateInsideClass() {
        System.out.println("Private Age accessed inside class: " + age);
        showPrivate();
    }
}

// Another class in the same package
public class AccessDemo {
    public static void main(String[] args) {

        Person p = new Person();

        // Public members: Accessible
        System.out.println(p.name);
        p.showPublic();

        // Private members: NOT accessible directly → using public method instead
        p.accessPrivateInsideClass();

        // Protected: Accessible (same package)
        System.out.println(p.city);
        p.showProtected();

        // Default: Accessible (same package)
        System.out.println(p.country);
        p.showDefault();
    }
}
