public class WrapperDemo {
    public static void main(String[] args) {

        int a = 5;

        // Autoboxing: primitive → Wrapper object
        Integer obj = a;

        // Unboxing: Wrapper object → primitive
        int b = obj;

        System.out.println("Integer object: " + obj);
        System.out.println("Primitive value: " + b);

        // Parsing example
        String number = "100";
        int parsed = Integer.parseInt(number);

        System.out.println("Parsed int: " + parsed);
    }
}
