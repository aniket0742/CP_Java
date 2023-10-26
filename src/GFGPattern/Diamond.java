package GFGPattern;

public class Diamond {
    public static void main(String[] args) {
        printDiamond(5);
    }
    static void printDiamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= i + 1; c++) {
                System.out.print("* ");
            }
            for (int p = 1; p <= n - 1 - i; p++) {
                System.out.print(" ");
            }
            System.out.println();

        }
        // Second Pyramid
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int c=1;c<=((n-i)+1);c++){
                System.out.print("* ");
            }
            for(int d=1;d<=i;d++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
