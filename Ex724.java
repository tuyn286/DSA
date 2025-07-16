public class Ex724 {
    public static void main(String[] args) {
        int[] arr = {-1,-1,1,1,0,0};
        System.out.println(solution(arr));
    }
    public static int solution(int[] nums){
        //xay dung mang cong don
        int len = nums.length;
        int[] F = new int[len];
        for (int i = 0; i< len; i++){
            if (i == 0){
                F[i] = nums[i];
            } else {
                F[i] = F[i-1] + nums[i];
            }
        }
        // tong tat ca cac so ben phai bang 0
        if ((F[len-1]-F[0]) == 0){
            return 0;
        }
        for (int i = 1; i < len-1; i++){
            // ben trai bang ben phai
            if ((F[len-1] - F[i]) == (F[i-1])){
                return i;
            }
        }
        // tong tat ca cac so ben trai bang 0
        if (F[len-2] == 0){
            return len-1;
        }
        return -1;
    }
}
