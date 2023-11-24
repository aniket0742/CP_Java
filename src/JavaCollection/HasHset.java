package JavaCollection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class HasHset {
    public static void main(String[] args) {
        // No duplicate elements are allowed
        Set<Integer> set= new HashSet<>();
        //Set<Integer> set= new LinkedHashSet<>();  number is added to set in order of inputing
        // order is not defined
        // Set<Integer> set= new TreeSet<>;   properties of set but the elements are in sorted form 
        set.add(23);
        set.add(24);
        set.add(74);
        set.add(89);
        set.add(66);
        set.remove(23);
        System.out.println((set.contains(100)));
        //set.isEmpty()
        //set.clear(); use when proceeding to a new testcase
        System.out.println(set);
    }
}
