import java.util.Scanner;
public class incrementconvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, c = 0, d = 0;

        System.out.print("Enter num1: ");
        x = scanner.nextInt();

        System.out.print("Enter num2: ");
        y = scanner.nextInt();

        for (int i = 0; i < 15; i++) {
            x = x + 2;

            if (i <= 9) {
                y = y + 3;

                if (i >= 3) {
                    c += y;
                }
            }

            if (i >= 8) {
                d += x;
            }
        }

        x = c + d;
        System.out.println(x);
    }
}




