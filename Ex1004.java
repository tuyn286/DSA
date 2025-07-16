public class Ex1004 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(nums, 3));
    }

    public static int longestOnes(int[] nums, int k) {
        int begin=0, end, zero=0, len = 0;
        for (end = 0; end < nums.length; end++){
            if (nums[end] == 0){
                zero++;
            }
            while (zero > k){ // dam bao end van chay neu chua k phan tu 0
                if (nums[begin] == 0){
                    zero--;
                }
                begin++;
            }
            // cong 1 vi: tinh luon ca phan tu fliped
            len = Math.max(len, end - begin + 1);
        }
        return len;
    }
}
