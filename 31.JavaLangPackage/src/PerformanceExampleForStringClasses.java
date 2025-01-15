public class PerformanceExampleForStringClasses{
    public static void main(String[] args) {
        long startTime, endTime;

        // Testing String
        startTime = System.currentTimeMillis();
        String s = "Hello";
        for (int i = 0; i < 10000; i++) {
            s = s + " World";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Time: " + (endTime - startTime) + "ms");

        // Testing StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + "ms");

        // Testing StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sbuilder = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            sbuilder.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + "ms");
    }
}
