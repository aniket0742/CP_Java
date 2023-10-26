package GFGPattern;

public class testpyram {
    public static void main(String[] args) {
        printTriangle(5);
    }
    static void printTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }


            for(int c=1;c<=((2)*(n-i)+1);c++){
                System.out.print("*");

            }
            for(int d=1;d<=i;d++){
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}
