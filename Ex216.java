import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Ex216 {
    public static void main(String[] args) {
        List<List<Integer>> res = combinationSum3(3,7);
        for (List<Integer> list : res){
            for (int i: list){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(findCombineOfN(1,k,n));
        return res;

    }

    public static List<Integer> findCombineOfN(int i, int k, int n){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        // khoi tao gia tri mac dinh
        for (int q = 0; q < k; q++){
            list.add(0);
        }
        for (int j = list.get(i-1) + 1; j <= n - k + i; j++){
            if (j > 9){
                list.set(i, j);
                sum+=j;
                if (i == k){
                    if (sum == n){
                        return list;
                    }
                }else {
                    return findCombineOfN(i+1,k,n);
                }
            }
        }
        return findCombineOfN(i+1,k,n);
    }
}
