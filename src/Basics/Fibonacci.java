package Basics;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n = in.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci eries upto " + n + "terms");
        for(int i = 0; i < n; i++){
            System.out.println(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        in.close();
    }
}
