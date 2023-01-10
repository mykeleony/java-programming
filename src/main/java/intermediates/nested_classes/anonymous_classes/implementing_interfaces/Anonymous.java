package intermediates.nested_classes.anonymous_classes.implementing_interfaces;


/*
* Instantiating interfaces as anonymous classes
* */
public class Anonymous {

    public static void main(String[] args) {
        Text text = new Text() {
            @Override
            public void printText() {
                System.out.println("Any interface text");
            }
        };

        text.printText();
    }
}
