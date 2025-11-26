import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();

        vec.add("Apple");
        vec.add("Banana");
        vec.add("Cherry");

        vec.add(1, "Orange"); // Insert at index
        vec.remove("Banana"); // Remove element

        System.out.println("Vector elements: " + vec);
        System.out.println("Size: " + vec.size());
        System.out.println("Contains Cherry: " + vec.contains("Cherry"));
    }
}
