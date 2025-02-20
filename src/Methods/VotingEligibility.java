//A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.
package Methods;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your age to check your voting eligibility: ");
        int age = in.nextInt();

        eligibility(age);
        in.close();
    }
    static void eligibility(int age){
        if(age < 18){
            System.out.println( "you are not eligible to vote");
        }
        else if(age >= 18){
            System.out.println("you are eligible for voting");
        }
        else {
            System.out.println("Please enter a valid age number");
        }
    }
}
