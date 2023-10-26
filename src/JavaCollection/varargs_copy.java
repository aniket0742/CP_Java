package JavaCollection;

import java.util.Arrays;

public class varargs_copy {
    public static void main(String[] args) {
        fun("57","www");
        gu(23,67,"aniket","wuw");

    }
    static void gu(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...c){
        System.out.println(Arrays.toString(c));
    }
    static void fun(String ...c){
        System.out.println(Arrays.toString(c));
    }
}
