import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Revenue revenue = Revenue.readRevenue(String.format("Revenue%d.ser", 2023));
        ArrayList<Payment> payments = revenue.getPaymentList();

        System.out.println(revenue);

        System.out.println(payments);

    
    }}
