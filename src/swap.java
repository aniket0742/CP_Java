import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter num 1 and num 2");
        int n1= in.nextInt();
        int n2= in.nextInt();
        n1= n1+ n2;
        n2= n1-n2;
        n1= n1-n2;
        System.out.println(n1);
        System.out.println(n2);
    }
}
