package Arrays;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int nums[] = {3, 4, 56, 8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 90;
    }
}
