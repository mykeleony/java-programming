package intermediates.nested_classes.inner_classes;

public class External {
    private String text = "External text";

    class Inner {
        private String text = "Inner class";

        public void printText() {
            System.out.println(text);

            // Acessing external class fields
            System.out.println(External.this.text);
        }
    }

    public static void main(String[] args) {
        External external = new External();
        Inner inner = external.new Inner();

        inner.printText();
    }
}
