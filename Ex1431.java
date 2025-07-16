import java.util.ArrayList;
import java.util.List;

public class Ex1431 {
    public static void main(String[] args) {
        int[] cadies = {4,2,1,1,2};
        System.out.println(solution(cadies, 1));
    }
    public static List<Boolean> solution(int[] candies, int extraCandies){
        int max = candies[0];
        int len = candies.length;
        // tim ra dua tre co so keo lon nhat
        for (int i =1 ; i< len; i++){
            if (max < candies[i]){
                max = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
