package intermediates.string_manipulation;

public class ElegantConcatenation {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E"};
        // Can be done with StringBuilder as well, but it would not be Thread Safe
        StringBuffer sb = new StringBuffer();   // Thread safe

        for (String letter : letters)
            sb.append(letter);

        System.out.println(sb.toString());

        String alphabet = new String(sb);
        System.out.println(alphabet);

        System.out.println(sb.reverse());
    }
}
