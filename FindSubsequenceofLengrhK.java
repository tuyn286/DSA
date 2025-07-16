import java.util.Arrays;

public class FindSubsequenceofLengrhK {
    public static void main(String[] args){
        int[] input = {-1,-2,3,4};
        int[] res = maxSubsequence(input, 3);
        System.out.println(Arrays.toString(res));
    }
    public static int[] maxSubsequence(int[] nums, int k){
        int length = nums.length;
        // tao mang 2 chieu co chua index - value
        int[][] vals = new int[length][2];
        for (int i =0 ; i<length ; i++){
            vals[i][0] = i;
            vals[i][1] = nums[i];
        }
        // sap xep theo value
        for(int i =0;i<length;i++){
            for(int j = i+1;j<length;j++){
                if (vals[j][1]>vals[i][1]){
                    int temp[] = vals[j];
                    vals[j]=vals[i];
                    vals[i]=temp;
                }
            }
        }
        // cat ra k phan tu dau tien
        int[][] resVals = new int[k][2];
        for (int i = 0; i<k;i++){
            resVals[i] = vals[i];
        }
        // sap xep theo index
        for(int i =0;i<k;i++){
            for(int j = i+1;j<k;j++){
                if (resVals[j][0]<resVals[i][0]){
                    int temp[] = resVals[j];
                    resVals[j]=resVals[i];
                    resVals[i]=temp;
                }
            }
        }
        int[] result = new int[k];
        for (int i = 0; i<k;i++){
            result[i] = resVals[i][1];
        }
        return result;
    }
}
