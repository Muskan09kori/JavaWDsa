package Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String Personalized = MyGreet(name);
        System.out.println(Personalized);
    }

    static String MyGreet(String name){
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "Hello everyone,how are you all!";
        return greeting;
    }
}
