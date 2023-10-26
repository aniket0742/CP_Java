import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class metho {
    public static void main(String[] args) {
       //int ans = sum();
        //System.out.println(ans);
       // String se= greet();
       // System.out.println(se);
        int an= sum3(20 , 40);
        System.out.println(an);
    }
    static int sum3(int a, int b){
        int su= a+b;
        return su;
    }
    static int sum(){
        Scanner iny= new Scanner(System.in);
        System.out.println("Enter num");
        int n1= iny.nextInt();
        int n2= iny.nextInt();
        int sum1= n1+n2;
        return sum1;

    }
    static String greet(){
        String hel="YO how are u";
                return hel;
    }

}
