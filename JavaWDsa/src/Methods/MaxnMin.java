package Methods;
import java.util.Scanner;
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class MaxnMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        maximun(num1, num2, num3);
        minimum(num1, num2, num3);

    }
    static void maximun(int a, int b, int c){
        if(a >= b && a >= c){
            System.out.println(a + " is the maximum number");
        }
        else if(b >= a && b >= c){
            System.out.println(b + " is the maximun number ");
        }
        else {
            System.out.println(c + " is the maximun number");
        }
    }

    static void minimum(int a, int b, int c){
        if(a <= b && a <= c){
            System.out.println(a + " is the minimun number");
        }
        else if (b <= c && b <= a){
            System.out.println(b + " is the minimun number");
        }
        else {
            System.out.println(c + " is the minimun number ");
        }
    }
}
