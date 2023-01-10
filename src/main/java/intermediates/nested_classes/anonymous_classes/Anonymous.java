package intermediates.nested_classes.anonymous_classes;

public class Anonymous {
    public void printText() {
        System.out.println("Any text");
    }

    public static void main(String[] args) {
        new Anonymous().printText();

        Anonymous anonymous = new Anonymous() {
            public void printText() {
                System.out.println("Any text overriden");
            }
        };

        anonymous.printText();
    }
}
