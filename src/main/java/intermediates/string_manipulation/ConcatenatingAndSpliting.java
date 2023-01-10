package intermediates.string_manipulation;

import intermediates.string_manipulation.concatenation_and_splitting.Person;

public class ConcatenatingAndSpliting {
    public static void main(String[] args) {
        String alphabet = String.join(", ", "A", "B", "C");
        System.out.println(alphabet);

        String[] letters = alphabet.split(", ");

        for(String letter : letters)
            System.out.println(letter);

        String fileLine = "1;Myke;10";
        String[] infos = fileLine.split(";");

        for (String info : infos)
            System.out.println(info);

        // Application example
        Person p = new Person(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
        System.out.println(p);
    }
}
