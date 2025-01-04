import java.util.*;

public class PriorityQuueueds {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.5);
        queue.offer(2.3);
        queue.offer(3.8);
        queue.offer(2.0);
        queue.offer(3.1);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue.peek());
    }
}
