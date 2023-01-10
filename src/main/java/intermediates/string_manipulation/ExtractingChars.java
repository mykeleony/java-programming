package intermediates.string_manipulation;

public class ExtractingChars {
    public static void main(String[] args) {
        String java = "java";

        char char_j = java.charAt(0);
        System.out.println(char_j);

        for (char c : java.toCharArray())
            System.out.println(c);

        char[] jav = new char[3];
        java.getChars(0, 3, jav, 0);
        System.err.println(jav);

        // Same as
        for (int i = 0, j = 0; i < 3; i++, j++)
            jav[j] = java.charAt(i);
    }
}
