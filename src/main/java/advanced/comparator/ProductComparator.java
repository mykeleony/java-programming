package advanced.comparator;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        String p1Name = o1.getName().toLowerCase();
        String p2Name = o2.getName().toLowerCase();

        return p1Name.compareTo(p2Name);
    }

}
