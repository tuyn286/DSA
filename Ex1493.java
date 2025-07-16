public class Ex1493 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        // sử dụng dynamic sliding window
        int begin = 0, end, len = 0, zero = 0, numsLen = nums.length;
        for (end = 0; end < numsLen; end++){
            if (nums[end] == 0){
                zero++;
            }
            while (zero > 1){ // duy tri it nhat 1 phan tu 0
                if (nums[begin] == 0){
                    zero--;
                }
                begin++;
            }
            // khong cong 1 vi phan tu 0 da bi cat di
            len = Math.max(len, end - begin);
        }
       return len;
    }
}
