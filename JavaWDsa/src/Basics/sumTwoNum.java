package Basics;
import java.util.Scanner;
public class sumTwoNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is:" + sum);
    }
}
