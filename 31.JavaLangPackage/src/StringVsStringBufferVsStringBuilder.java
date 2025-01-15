public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        // String Example
        String s = "Hello";
        s.concat(" World"); // Creates a new String object
        System.out.println("String: " + s); // Output: Hello

        // StringBuffer Example
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // Modifies the original object
        System.out.println("StringBuffer: " + sb); // Output: Hello World

        // StringBuilder Example
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World"); // Modifies the original object
        System.out.println("StringBuilder: " + sbuilder); // Output: Hello World
    }
}
