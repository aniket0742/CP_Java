package JavaCollection;
import java.util.ArrayDeque;
public class Aarraydequeue {
    public static void main(String[] args) {
        // add/pull from any side either front or back
        ArrayDeque<Integer> arrdq = new ArrayDeque<>();
        arrdq.offer(23);
        arrdq.offerFirst(56);
        arrdq.offerLast(78);
        System.out.println(arrdq);
        System.out.println(arrdq.pollLast());

    }
}