package JavaCollection;
import java.util.Stack;
public class Stackk {
    public static void main(String[] args) {
        // last in that out
        Stack<String> game = new Stack<>();
        game.push("Battlefield V");
        game.push("RDR2");
        game.push("FIFA 23");
        System.out.println(game.peek());
        game.pop();
    }
}