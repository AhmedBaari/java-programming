import java.util.Scanner;

public class UserInput {
    public static void main (String[] agrs) {
        Scanner myScanner = new Scanner(System.in);


        // SCANNER NEXT
        System.out.println("Input any 1 word: ");
        String nextInput = myScanner.next();

        System.out.println("I used NEXT and got: " + nextInput);

        // SCAN COMPLETE SENTENCE (NEXTLINE)
        System.out.println("Input 1 line: ");
        String nextLineInput = myScanner.nextLine();

        System.out.println("I used NEXTLINE and got: " + nextLineInput);        

        // SCAN INTEGER
        System.out.println("Input 1 integer: ");
        int nextIntInput = myScanner.nextInt();

        System.out.println("I used NEXTINT and got: " + nextIntInput);



    }
    

    
}
