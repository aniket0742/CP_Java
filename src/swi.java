import java.util.Scanner;

public class swi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fruit= sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("KOF");
            case "Apple" -> System.out.println("Red ");
            default -> System.out.println("No valid value ");
        }

    }
}