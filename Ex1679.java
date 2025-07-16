import java.util.Arrays;

public class Ex1679 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(maxOperations(nums, 5));
    }

    public static int maxOperations(int[] nums, int k){
        int left = 0, right = nums.length-1, count = 0;
        Arrays.sort(nums);
        while (left < right) {
            if (nums[left] + nums[right] == k){
                left++;
                right--;
                count++;
            }
            if (nums[left] < k - nums[right]){
                left++;
            }
            if (nums[right] > k - nums[left]){
                right--;
            }
        }
        return count;
    }
}
