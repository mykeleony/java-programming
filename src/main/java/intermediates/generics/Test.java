package intermediates.generics;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        PrintService<String> printService = new PrintService<>();

        printService.setList(Arrays.asList("Myke", "Debora", "Ellen", "Reinaldo"));

        printService.print();
    }

}
