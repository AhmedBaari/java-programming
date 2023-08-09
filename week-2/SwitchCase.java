public class SwitchCase {
    public static void main (String[] args) {
        int i = 2;
        switch(i) {
            case 0:
                System.out.println("zero");

            case 1:
                System.out.println("This is 1");
            case 2:
                System.out.println("This is 2");
                System.out.println("Hello World");
            default:
                // Since I did not mention break, default will run after "2"as well
                System.out.println("Default will work too");
        }
    }
}