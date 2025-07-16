public class Ex334 {
    public static void main(String[] args) {
        int[] nums = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums){
        if (nums[0] < nums[1] && nums[1] < nums[2]) {
            return true;
        }
        for (int i = 3; i < nums.length; i++){
            if (nums[i-1]<nums[i] && nums[i-2] < nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
