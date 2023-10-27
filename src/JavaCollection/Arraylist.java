package JavaCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Arraylist {
    public static void main(String[] args) {
        // adding elements to array after limit
        ArrayList<String> students = new ArrayList<>();
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
        String s = students.get(3);
        students.set(3,"tyt");
        System.out.println(newlis.contains("WWW"));
        // iterating the list (3 methods)
        for(int i=0;i<newlis.size();i++){
            System.out.println(newlis.get(i));
        }
        for(String ele:newlis){
            System.out.println(ele);
        }
        Iterator<String> it= newlis.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
