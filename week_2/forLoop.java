public class forLoop {
    public static void main (String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i%2 == 0) continue; // Will skip to next iteration when even numbers come up
            System.out.println(i); // 1 3

            if(i == 4) break; // breaks the loop when 4 occurs
        }
    }
}
