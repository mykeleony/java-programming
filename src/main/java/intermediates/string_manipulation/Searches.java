package intermediates.string_manipulation;

public class Searches {
    public static void main(String[] args) {
        String ban = "ban";
        String ana = "ana";
        String banana = ban + ana;

        System.out.println(ban.indexOf('b'));
        System.out.println(ana.indexOf('a', 1));
        System.out.println(ban.indexOf('x'));   // Returns -1.
        System.out.println(banana.indexOf(ana));

        System.out.println(banana.lastIndexOf('a'));    // Index of the last time 'a' ocurred.
        System.out.println(banana.lastIndexOf(ana));

        System.out.println(banana.contains(ana));
        System.out.println(banana.contains("myke"));
    }
}
