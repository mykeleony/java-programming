package basics.data_structures.arrays;

public class AlocacaoEAcesso {
    public static void main(String[] args) {
        int numbers[] = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }

        int numbers2[] = {1, 2, 3, 4, 5};
    }
}
