package DSA;

import java.util.*;

public class LessonQueue {
    public static void main(String[] args) {
        System.out.println(transform(2,5));
    }
    // Tìm số nhỏ nhất được tạo từ 0 và 9 sao cho chia hết cho n
    public static int findNumber(int n){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(9);
        while (true){
            if (queue.peek() % n == 0){
                return queue.poll();
            } else {
                queue.add(queue.peek() * 10);
                queue.add(queue.peek() * 10 + 9);
                queue.poll();
            }
        }
    }
    // In ra tất cả các số lộc phát không quá n chữ số
    public static void soLocPhat(int n){
        Queue<String> queue = new ArrayDeque<>();
        Stack<String> stack = new Stack<>();
        queue.add("6");
        queue.add("8");
        while (queue.peek().length() <= n){
            queue.add(queue.peek() + "6");
            queue.add(queue.peek() + "8");

            stack.push(queue.poll()); // them vao stack
        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }
    // Số lần thực hiện biến đổi S thành T
    public static int transform(int s, int t){
        int step = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        while (true){
            if (queue.peek() == t){
                return step;
            }
            queue.add(queue.peek() - 1);
            queue.add(queue.peek() * 2);
            queue.poll();
            step++;
        }
    }
    // Tìm đường đi ngắn nhất đến đích
}
