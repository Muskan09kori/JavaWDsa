package Methods;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        evenOdd(n);
        in.close();
    }
    static void evenOdd(int n){
        if(n % 2 == 0){
            System.out.println(n + " is even number");
        }
        else{
            System.out.println(n + " is odd number");
        }
    }
}
