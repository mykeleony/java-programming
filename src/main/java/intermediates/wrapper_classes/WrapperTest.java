package intermediates.wrapper_classes;

public class WrapperTest {
    public static void main(String[] args) {
        Short s;
        s = 1;

        Byte b = 4;
        Integer i = 8;
        Long l = 8L;
        Float f = 8.0F;
        Double d = 8.0;
        Boolean bool = Boolean.TRUE;
        Character c = 'c';

        // Converting one type into another
        System.out.println(i.floatValue());

        // Converting numbers as texts to actual numbers
        System.out.println(Integer.parseInt(i.toString()));

        // Converting primitive type into primitive type by method
        Integer classInteger = Integer.valueOf(8);
        int primitiveInteger = classInteger.intValue();

        System.out.println(i.equals(i.intValue()));
    }
}
