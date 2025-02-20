package Switch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name of the fruit: ");

//        String fruit = in.next();
//        switch(fruit){
//            case "Mango":
//                System.out.println("King of Fruits");
//                break;
//            case "Apple":
//                System.out.println("Big red circular shape");
//                break;
//            case "Orange":
//                System.out.println("Rich in Vitamin C");
//                break;
//            case "Grapes":
//                System.out.println("Small cute little fruits");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit name!");

//      Enhanced switch statement --> (Alt + Enter)
//       switch (fruit) {
//            case "Mango" -> System.out.println("King of Fruits");
//            case "Apple" -> System.out.println("Bog red circular shape");
//            case "Orange" -> System.out.println("Rich in Vitamin C");
//            case "Grapes" -> System.out.println("Small cute little fruits");
//            default -> System.out.println("Please enter a valid fruit name!");
//        }

        int day = in.nextInt();
        switch(day){
            case 1:
                System.out.println("");
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        int days = in.nextInt();
        switch(days){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("weekend");
        }
    }
}
