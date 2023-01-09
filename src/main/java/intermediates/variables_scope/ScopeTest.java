package intermediates.variables_scope;

public class ScopeTest {
    private int value;

    public ScopeTest(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int calculateValue(int value) {
        value += 10;    // Parameter

        return value;
    }

    public int modifyingAttribute(int value) {
        this.value += value;

        return this.value;
    }

    public int localVariable() {
        int value = 5;

        if (true)
            value--;

        return value;   // Always return 4.
    }

    public void loopVariable() {
        for (int i = 0; i < 10; i++)
            System.out.println(i);

        //i++;  // Compilation error. i's scope belongs to the for loop only.

        int j;  // Now, j's scope is the method. It can be used in any method line after the line it was declared.

        for (j = 0; j < 10; j++)
            System.out.println(j);

        System.out.println(++j);
    }

    public void conditionVariable() {
        boolean flag = true;

        if (flag) {
            int n = 10;

            n++;

            System.out.println(n);
        }

        //System.out.println(n);    // Compilation error. n's scope is the "if" condition only.
    }

    public void blocksVariables(int n1) {
        int total = 0;

        try {
            int n2 = 0;

            total = n2 / n1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            total++;
            // n2++;    // Compilation error. n2's scope is the "try" block only.
            // e.printStackTrace();     Compilation error. e's scope is the "catch" block only.
        }

        n1++;

    }
}
