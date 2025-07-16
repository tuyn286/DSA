import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Ex933 {
//    private int counter;
    private Queue<Integer> queue;
    public Ex933(){
//        this.counter = 0;
        queue = new ArrayDeque<>();
    }
    public int ping(int t){
        queue.add(t);
        while (queue.peek() < t-3000 || queue.peek() > t){
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        Ex933 ex933 = new Ex933();
        ex933.ping(642);
        ex933.ping(1849);
        ex933.ping(4921);
        ex933.ping(5936);
    }
}
