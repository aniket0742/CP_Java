import java.util.Arrays;
import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=t.nextInt();
       rarray(n);
    }
        static void rarray(int n){
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            System.out.println(Arrays.toString(arr));
        int[] narr= new int[n];
        for(int j=0;j<n;j++){
            narr[j]=arr[n-j-1];
        }
            System.out.println("New reversed array is "+Arrays.toString(narr));
    }
}
