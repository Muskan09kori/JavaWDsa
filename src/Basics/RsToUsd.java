package Basics;
import java.util.Scanner;

//Input currency in rupees and output in USD.

public class RsToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double exchangeRate = 0.012;

        System.out.println("Enter the amount in INR: ");
        double inr = in.nextDouble();

        double usd = inr * exchangeRate;

        System.out.println("Equivalent amount in USD is : "  + usd);

        in.close();
    }
}
