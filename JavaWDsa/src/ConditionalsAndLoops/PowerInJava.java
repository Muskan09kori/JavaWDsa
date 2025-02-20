//Power in java
package ConditionalsAndLoops;
import java.lang.Math;
import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = in.nextDouble();

        System.out.println("Enter exponent: ");
        double exponent = in.nextDouble();

        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + power);

        in.close();
    }
}
