package JavaCollection;
import java.util.LinkedList;
import java.util.Queue;
public class LinkyList {
    public static void main(String[] args) {
        // Queue: First in first out
        Queue<Integer> que= new LinkedList<>();
        // offer: for adding elements to queue
        que.offer(34);
        que.offer(45);
        que.offer(90);
        que.offer(68);
        int g=que.poll();
        System.out.println(g);
    }
}
