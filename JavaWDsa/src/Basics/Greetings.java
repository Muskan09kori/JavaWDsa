package Basics;
//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        System.out.println("May you have a great day " + name + ",may god bless you!");
    }
}
