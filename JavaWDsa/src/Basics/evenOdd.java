package Basics;
import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class evenOdd {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if(n%2 == 0){
            System.out.println("The given number is even:" + n);
        }
        else {
            System.out.println("The given number is odd: " + n);
        }
        in.close();
    }
}
