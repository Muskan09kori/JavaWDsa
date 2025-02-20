package Methods;
import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i = 100; i < 1000; i++){
            if(isArmstromng(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstromng(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
