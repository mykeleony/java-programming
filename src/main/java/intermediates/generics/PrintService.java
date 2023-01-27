package intermediates.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * This class uses generics to print lists in a specified format.
 *
 * Date: 27/01/2023
 * Author: Myke Amorim
 */
public class PrintService<AnyType> {

    private List<AnyType> list = new ArrayList<>();

    public AnyType first() {
        if (list.isEmpty())
            throw new IllegalStateException("The list is empty.");

        return list.get(0);
    }

    public void print() {
        System.out.print("[");

        if (!list.isEmpty())
            System.out.print(list.get(0));

        for(int i = 1; i < list.size(); i++)
            System.out.print(", " + list.get(i));

        System.out.print("]");
    }

    public List<AnyType> getList() {
        return list;
    }

    public void setList(List<AnyType> list) {
        this.list = list;
    }
}
