package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        // adding elements to array after limit
        ArrayList<String> students= new ArrayList<>();
        students.add("Aniket");
        System.out.println(students);
        students.add("Naman");
        System.out.println(students);
        students.add(1,"Trent");
        List<String> newlis= new ArrayList<>();
        newlis.add("WWW");
        newlis.add("ERER");
        students.addAll(newlis);
        System.out.println(students);
        students.remove(3);
        students.remove("WWW");
    }
}
