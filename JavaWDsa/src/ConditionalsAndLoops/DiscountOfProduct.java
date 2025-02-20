//Calculate Discount Of Product
package ConditionalsAndLoops;
import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the original amount of the product: ");
        double originalProduct = in.nextDouble();

        System.out.println("Enter the discount percentage: ");
        double discountPercentage = in.nextDouble();

        double discountAmount = (discountPercentage / 100) * originalProduct;

        double FinalPrice = originalProduct - discountAmount;

        System.out.println("The original Price of the product: " + originalProduct);
        System.out.println("The discount percentage: " + discountPercentage);
        System.out.println("Total amount after discount: " + discountAmount);
    }
}