public class PerformanceTest {
    public static void main(String[] args) {

        // String Test
        long startTime = System.currentTimeMillis();
        String text = "A";
        for (int i = 0; i < 50000; i++) {
            text = text + "A"; // Creates new String object each time
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String time: " + (endTime - startTime) + "ms");


        // StringBuffer Test
        startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("A");
        for (int i = 0; i < 50000; i++) {
            sb.append("A");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endTime - startTime) + "ms");


        // StringBuilder Test
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("A");
        for (int i = 0; i < 50000; i++) {
            sb2.append("A");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + "ms");
    }
}
