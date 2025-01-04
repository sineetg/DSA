import java.util.LinkedList;
import java.util.Queue;

public class Queueds {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steive");
        queue.offer("Harold");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.contains("Abebe"));
    }
      
}
