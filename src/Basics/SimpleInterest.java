package Basics;
import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class SimpleInterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principle: ");
        float p = in.nextInt();
        System.out.println("Enter the rate: ");
        float r = in.nextFloat();
        System.out.println("Enter the time in years: ");
        float t = in.nextInt();

        float SI = (p*r*t) / 100;
        System.out.println("The simple interest is: " + SI);

        in.close();
    }
}
