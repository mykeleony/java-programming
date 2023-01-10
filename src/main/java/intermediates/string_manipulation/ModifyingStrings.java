package intermediates.string_manipulation;

public class ModifyingStrings {

    public static void main(String[] args) {
        String test = "This is a test.";

        System.out.println(test.substring(5));
        System.out.println(test.substring(0, 4));   // Not inclusive.

        String hello = "hello";
        String world = "world";
        String helloworld = hello.concat(world);
        System.out.println(helloworld);

        String wrongSpaces = "s p a z e s";
        System.out.println(wrongSpaces);
        String rightSpaces = wrongSpaces.replace('z', 'c');

        String noSpaces = rightSpaces.replaceAll(" ", "");
        System.out.println(noSpaces);

        String name = " Myke ";
        System.out.println(name);
        System.out.println(name.trim());    // Removes lateral spaces.
    }
}
