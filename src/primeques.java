import java.util.Scanner;

public class primeques {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int c= in.nextInt();
        System.out.println(isarm(c));

    }
    static boolean isarm(int n){
        int og=n;
        int sum=0;
        while(n>0){
            int rem= n%10;
            n=n/10;
            sum=sum+ rem*rem*rem;
        }
          if(sum==og){
              return true;
          }
          return false;
    }
    static boolean isprime(int c){
        if(c<=1){
            return false;
        }
        int n=2;
        while(n*n<=c){
            if(c%n==0){
                return false;
            }
            n++;
        }


        return true;
    }
}
