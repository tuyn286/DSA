package DSA;

import java.util.PriorityQueue;
import java.util.Queue;

public class LessonPriorityQueue {
    public static void main(String[] args) {
        int[] a = {4,3,2,6};
        System.out.println(noiDay(a));
    }
    public static int noiDay(int[] a){
    Queue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : a){
            priorityQueue.add(i);
        }
        int cost = 0;
        int temp;
        while (priorityQueue.size() > 1){
            temp = priorityQueue.poll(); // lay ptu be nhat va xoa no di
            temp+=priorityQueue.poll();
            cost+=temp;
            priorityQueue.add(temp);
        }
        return cost;
    }
}
