//Write a program to print the sum of two numbers entered by user by defining your own method.
package Methods;
import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();

        System.out.println("Enter num2: ");
        int num2 = in.nextInt();

        int answer = sum(num1, num2);
        System.out.println("The sum of two numbers is: " + answer);
        in.close();
    }
    static int sum(int a, int b){
        return a + b;
    }
}
