package Basics;
import java.util.Scanner;
//To find out whether the given String is Palindrome or not.

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");

        String str = in.nextLine();
        if(isPalindrome(str)){
            System.out.println(str + " string is Palindrome");
        }
        else {
            System.out.println(str + " stirng is not Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        int left = 0, right = str.length() -1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
