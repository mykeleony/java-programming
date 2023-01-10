package intermediates.nested_classes.local_classes;

public class External {
    public void method() {

        // only <default> access modifier is available on local classes
        class LocalClass {
            private String text = "Local class text";

            public void printText() {
                System.out.println(text);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printText();
    }

    public static void main(String[] args) {
        new External().method();
    }
}
