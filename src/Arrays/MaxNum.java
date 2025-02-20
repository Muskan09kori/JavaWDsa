package Arrays;
import java.util.Arrays;

public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {29, 56, 1, 55, 34, 20};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr, 3, 5));

    }
    static int maxRange(int[] arr, int start, int end) {
        int maxValue = arr[start];
        for (int i = 0; i < end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    static int max(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
