import java.util.Scanner;

public class increpyt {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = 0;
            int d = 0;
            int i=0;
            while(i<15){
                x+=2;
                if(i<=9){
                    y+=3;
                    if(y>=3){
                        c+=y;
                    }
                }
                if(i>=8){
                    d+=x;
                }
          i++;
        }
            int k=c+d;
        System.out.println(k);
    }
}
