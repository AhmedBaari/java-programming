import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Keyboard input object
        System.out.print("Enter a string: "); 
        String input = scanner.nextLine(); // Taking user input as a line

        if (input.equals("hello")) { // using this input as an argument
            System.out.println("You entered hello!");
        } else {
            System.out.println("You did not enter hello.");
        }
    }
}