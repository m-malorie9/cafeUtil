import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for (int x = 1; x <= 10; x++){
            sum = sum + x;
        }
        return sum;
    }

    public void printPriceChart(String name, double price, int max) {
        System.out.println(name);
        for (int x = 1; x <= max; x++) {
            System.out.println(x + " - " + (price * x));
        }
    }

    public double getOrderTotal(double[] orderTotal) {
        double sum = 0;
        for (int x = 0; x < orderTotal.length; x++) {
            sum += orderTotal[x];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices) {
        for (int x = 0; x < menu.size(); x++) {
            System.out.println(x + " " + menu.get(x) + " -- $" + prices.get(x));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        String userName = System.console().readLine();
        customers.add(userName);
    }

}
