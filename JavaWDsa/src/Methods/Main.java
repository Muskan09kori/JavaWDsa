package Methods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        //        sum();

        int ans = sum3(20,50);
        System.out.println(ans);
    }
//    Parameters
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

//    Return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.println("Entter number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = in.nextInt();

        System.out.println("Entter number 2:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of num1 and num2 is : " + sum);
    }

}
