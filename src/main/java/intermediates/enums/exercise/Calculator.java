package intermediates.enums.exercise;

/*
 * Author: Myke Amorim
 * Date: 01/06/2023 (Brazil)
 *
 * This class implements a calculator that performs basic arithmetic operations using an enum called Operation.
 * The Operation enum has an abstract method for each operation, which allows the behavior of each operation to be defined within the enum itself.
 * The Calculator class has a constructor that takes in a char representing the operation to be performed.
 * The toString method in the Operation enum has been overridden to output only the char representing the operation.
 */
public enum Calculator {
    SOMA('+') {
        @Override
        public double executeOperation(double x, double y) {
            return x + y;
        }
    }, SUBTRACAO('-') {
        @Override
        public double executeOperation(double x, double y) {
            return x - y;
        }
    }, MULTIPLICACAO('*') {
        @Override
        public double executeOperation(double x, double y) {
            return x * y;
        }
    }, DIVISAO('/') {
        @Override
        public double executeOperation(double x, double y) {
            return x / y;
        }
    };

    private final char operation;

    Calculator(char operation) {
        this.operation = operation;
    }

    public abstract double executeOperation(double x, double y);

    @Override
    public String toString() {
        return Character.toString(operation);
    }
}
