public class Ex643 {
    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(findMaxAverage(nums, 1));
    }
    public static double findMaxAverage(int[] nums, int k){
        int len = nums.length;
        // xay dung mang cong don
        int[] F = new int[len];
        for (int i =0; i< len;i++){
            if (i==0) {
                F[i] = nums[i];
            } else {
                F[i] = nums[i] + F[i-1];
            }
        }
        int max = F[k-1], sum;
        for (int i = 1; i <= len-k; i++){
            sum = F[k+i-1] - F[i-1];
            max = Math.max(sum,max);
        }
        return (double) max /k;
    }
}
