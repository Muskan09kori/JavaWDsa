package Basics;
import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is the largest number");
        }
        else if(num1 == num2){
            System.out.println("They both are equal");
        }
        else {
            System.out.println(num2 + " is the largest number");
        }
        in.close();
    }
}
