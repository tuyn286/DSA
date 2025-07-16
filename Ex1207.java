import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex1207 {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        // key: gia tri , value: so lan xuat hien
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        boolean check;
        for (int i : map.values()){
            check = set.add(i);
            if (!check){
                return false;
            }
        }
        return true;
    }
}
