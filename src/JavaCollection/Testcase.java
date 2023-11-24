package JavaCollection;
import java.util.*;
import java.lang.*;
public class Testcase {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            int X= sc.nextInt();
            int D= sc.nextInt();
            int count=0;
                for(int j=1;j<130;j++){
                    int p=N-j*5*X;
                    if(p>(X*5)){
                        count=count+1;
                    }
                    else break;
                }
            System.out.println(count+D);
        }
    }
}
