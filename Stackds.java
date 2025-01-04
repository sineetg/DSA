import java.util.Stack;

public class Stackds {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        stack.pop();
        System.out.println(stack);

        String faveGame = stack.peek();
        System.out.println(faveGame);
}
    }
    