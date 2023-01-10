package intermediates.string_manipulation;

public class StringMethods {
    public static void main(String[] args) {
        String hello1 = "hello";
        String hello2 = "Hello";
        String hello3 = "hello";

        System.out.println(hello1.equals(hello2));
        System.out.println(hello1.equals(hello3));

        System.out.println(hello1.equalsIgnoreCase(hello2));

        System.out.println(hello1 == hello2);
        System.out.println(hello1 == hello3);

        String hey1 = "hey";
        String hey2 = new String(hey1);

        System.out.println(hey1 == hey2);       // Compares references
        System.out.println(hey1.equals(hey2));  // Compares content

        String banana = "banana";
        String ban = "ban";
        String ana = "ana";

        System.out.println(banana.regionMatches(1, ana, 0, 3));
        System.out.println(banana.regionMatches(2, ana, 1, 2));
        System.out.println(banana.regionMatches(true, 0, ban, 0, 3));

        System.out.println(banana.endsWith(ana));
        System.out.println(banana.startsWith(ban));

        String a = "a";
        String b = "b";
        String upperA = "A";

        /*
        * -1 -> a > b
        * 0 -> a = b
        * 1 -> a < b
        * */
        System.out.println(a.compareTo(b));
    }
}
