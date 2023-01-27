package intermediates.equals_hashcode;

public class Test {

    public static void main(String[] args) {
        Customer c1 = new Customer("Myke", "myke.amorim@usp.br");
        Customer c2 = new Customer("Debora", "myke.amorim@usp.br");
        Customer c3 = new Customer("Myke", "myke.amorim@usp.br");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1 + " equals " + c2 + "?");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));

        System.out.println(c1 + " equals " + c3 + "?");
        System.out.println(c1.equals(c3));
        System.out.println(c3.equals(c1));
        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());
    }

}
