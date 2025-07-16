import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums){
        int len = nums.length;
        // tính res bằng cách nhân left với right theo index
        int[] res = new int[len];
        for (int i = 0; i < len; i++){
            res[i] = 1;
        }
        // tính tích các phần từ từ trái sang phải (không tính phần tử đầu tiên).
        for (int i = 1; i < len; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        // tương tự tính từ bên phải sang trái
        int temp = 1;
        for (int i = len - 1; i >= 0; i--){
            res[i] *= temp;
            temp *= nums[i];
        }

        return res;
    }
}
