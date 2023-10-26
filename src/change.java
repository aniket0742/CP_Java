import java.util.Arrays;

public class change {
    public static void main(String[] args) {
        int [] arr= {1,7,10,45,8};
        ch(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ch(int [] nums){
        nums [0]=99;
    }
}
