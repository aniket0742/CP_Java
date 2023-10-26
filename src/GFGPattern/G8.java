package GFGPattern;

public class G8 {
    public static void main(String[] args) {
        printTriangle(5);
    }

        static void printTriangle(int n) {

            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int c = 1; c <= ((2 * i) + 1); c++) {
                    System.out.print("*");
                }
                for (int p = 1; p <= n - 1 - i; p++) {
                    System.out.print(" ");

                }
                System.out.println();
            }
        }
    }

