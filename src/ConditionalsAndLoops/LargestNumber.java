package ConditionalsAndLoops;
import java.util.Scanner;

public class LargestNumber  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
        int max = Math.max(c, Math.max(a, b));
        System.out.println("The max number among the three is: " + max);
    }
}
