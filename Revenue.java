import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Revenue implements Serializable{
    private static final long serialVersionUID = 1L;
    private ArrayList<Payment> payments = new ArrayList<Payment>();
    private double revenue;

    public Revenue(){
    }

    public void addToRevenue(double price, Payment payment) {
        revenue += price;
        addPaymentToList(payment);
        System.out.println(payments);
    }

    public void addPaymentToList(Payment payment){
        payments.add(payment);
    }

    public double getRevenue(){
        return revenue;
    }

    public ArrayList<Payment> getPaymentList(){
        return payments;
    }

    public void writeRevenue(String filename){

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
            System.out.println("Revenue saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Revenue readRevenue(String filename){
        Revenue revenueData = new Revenue();

        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            revenueData = (Revenue) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            Revenue newRevenue = new Revenue();
            newRevenue.writeRevenue(filename);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } 

        return revenueData;
    }

    @Override
    public String toString() {
        return String.format("Revenue for this Year is %.2f ", revenue);
    }
}
