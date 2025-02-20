package Basics;
import java.util.Scanner;
//Factorial Program In Java

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i ;
        }
        System.out.print("Factorial of " + n + " is " + factorial );
        in.close();
    }
}
