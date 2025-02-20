package Basics;
import java.util.Scanner;

public class ElectricityBillCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the units consumed : ");
        int units = in.nextInt();

        double bill = calculateBill(units);
        System.out.println("Total Electricity bill : " + bill);
    }
    static double calculateBill(int units){
        double totalBill = 0;

        if(units <= 100){
            totalBill = 100 * 5;
        }
        else if(units <= 200){
            totalBill = (100 * 5) + ((units - 100) *7);
        }
        else if(units <= 300){
            totalBill = (100 * 5) + (100 * 7) + ((units - 100) * 10);
        }
        else {
            totalBill = (100 * 5) + (100 * 7) + (100 * 10) + ((units - 100) * 15);
        }
        return totalBill;
    }

}
