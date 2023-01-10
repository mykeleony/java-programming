package intermediates.string_manipulation;

public class StringCreation {
    public static void main(String[] args) {
        String empty = new String();    // ""
        String java = new String("java");
        System.out.println(java);

        String java2 = new String(java);
        System.out.println(java2);

        char[] javachar = {'j', 'a', 'v', 'a'};
        String java3 = new String(javachar);
        System.out.println(java3);

        char[] abcdef = {'a', 'b', 'c', 'd', 'e'};
        String abc = new String(abcdef, 0, 3);
        System.out.println(abc);

        byte[] ascii = {65, 66, 67, 68, 69};
        String asciiAlphabet = new String(ascii);
        System.out.println(asciiAlphabet);

        String java4 = "java";
        String java5 = "java";
    }
}
