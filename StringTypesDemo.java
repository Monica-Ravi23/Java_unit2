public class StringTypesDemo {
    public static void main(String[] args) {

        // String (immutable)
        String s = "Hello";
        s = s + " World";
        System.out.println(s);

        // StringBuffer (thread-safe)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);

        // StringBuilder (fastest)
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" World");
        System.out.println(sbd);

    }
}
