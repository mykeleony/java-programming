package basics.lang_resources;

public class Switchs {
    public static void main(String[] args) {
        int number = 1;

        switch (number) {
            case 1:
                System.out.println("Number 1.");
            break;

            case 2:
                System.out.println("Number 2.");
            break;

            default:
                System.out.println("Neither 1 or 2.");
        }
    }
}
