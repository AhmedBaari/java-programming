public class WhileLoop {
    public static void main (String[] args) {
        // General While Loop
        int i = 0;
        while(i < 5) {
            i++;
            System.out.print(i);
        }

        // Demonstrating Do While Loop
        i = 0;
        do {
            System.out.println("This will work once even if the condition is false");
        } while (i !=0);

    }
}
