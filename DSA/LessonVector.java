package DSA;

import java.util.Iterator;
import java.util.Vector;

public class LessonVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 100);
        v.add(2);
        v.add(3);
        Iterator<Integer> iterator = v.iterator();
        v.insertElementAt(100,1);

        for (int i : v){
            System.out.println(i);
        }

    }
}
