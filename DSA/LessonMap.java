package DSA;

import java.util.HashMap;
import java.util.Map;

public class LessonMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tuyen");
        map.put(2, "Tam");
        map.forEach((k,v)->{
            System.out.println(v);
        });
    }
}
