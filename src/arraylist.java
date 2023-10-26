import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {

        // ArrayList<Integer> list= new ArrayList<>(23);
        // list.add(23);
        // list.add(45);
        // list.set(1,78);
        // System.out.println(list);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0; i<3; i++){
            list.add(new ArrayList<>());


        }

    }
}
