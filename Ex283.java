import java.util.*;

public class Ex283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums){
        int left = 0, temp;
        for (int right = 0; right< nums.length; right++){
            if (nums[right] != 0){
                temp = nums[left];
                nums[left] = nums[right];
                nums[right] =temp;
            }
            left++;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }
}
