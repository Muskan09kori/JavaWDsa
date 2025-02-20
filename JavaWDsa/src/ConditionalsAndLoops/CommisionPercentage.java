//Calculate Commission Percentage
package ConditionalsAndLoops;
import java.util.Scanner;

public class CommisionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the comission percentage : ");
        double commisionPer = in.nextDouble();

        System.out.println("Enter the total sales amount: ");
        double totalSales = in.nextDouble();

        double comission = (commisionPer/100) * totalSales;

        System.out.println(comission  + " is the total comission");
        in.close();
    }
}
