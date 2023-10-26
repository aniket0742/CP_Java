import java.util.Arrays;

public class maxva {
    public static void main(String[] args) {
         int [] arr={12, 67,89,34};
        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
     static int max(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void reverse(int[]arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[]arr, int i1, int i2){
        int temp= arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}
