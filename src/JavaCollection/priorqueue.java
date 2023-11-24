package JavaCollection;
import java.util.Comparator;
import java.util.PriorityQueue;
public class priorqueue {
    public static void main(String[] args) {
        // elements pulled based on priority set
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(45);
        pq.offer(12);
        pq.offer(34);
        pq.offer(89);
        System.out.println(pq);
        /*here minheap is being implemented
        minheap: it pushes the minimum value to the front. (only the minimum value);
         */
        //So you can use Priority Queue function whenever you want to use heap use this to save time
        pq.poll();
        System.out.println(pq);
        to();
    }
    public static void to() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(45);
        pq.offer(12);
        pq.offer(34);
        pq.offer(89);
        System.out.println(pq);
        /*here minheap is being implemented
        minheap: it pushes the minimum value to the front. (only the minimum value);
         */
        //So you can use Priority Queue function whenever you want to use heap use this to save time
        pq.poll();
        System.out.println(pq);
    }
}
