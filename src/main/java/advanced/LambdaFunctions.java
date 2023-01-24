package advanced;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFunctions {

    public static void main(String[] args) {
        List<Bill> expiredBills = new BillDAO().findAllExpiredBills();

        System.out.println("Without lambdas: ");

        for (Bill b : expiredBills) {
            System.out.println("Sending email to " + b.getCustomerName());
        }

        System.out.println("With lambdas: ");

        expiredBills.forEach( (Bill b) -> {
            System.out.println("Sending email to " + b.getCustomerName());
        } );

        expiredBills.forEach(b -> System.out.println("Sending email to " + b.getCustomerName()));
    }

}

class Bill {

    private String customerName;
    private double amount;
    private OffsetDateTime dueDate;

    public Bill(String customerName, double amount, OffsetDateTime dueDate) {
        this.customerName = customerName;
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public OffsetDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
    }
}

class BillDAO {

    public List<Bill> findAllExpiredBills() {
        Bill b1 = new Bill("Myke", 1200.00, OffsetDateTime.now().minusDays(3));
        Bill b2 = new Bill("Debora", 12.00, OffsetDateTime.now().minusDays(4));
        Bill b3 = new Bill("Reinaldo", 12000.00, OffsetDateTime.now().minusDays(25));

        return Arrays.asList(b1, b2, b3);
    }

}
