public class ForEachLoopExtended {
    public static void main (String args[]) {
        int myArray[] = {3,4,5,6,23,13,56,25,99,105,144,67,85};
        int max = 0;

        for ( int element : myArray) { // note down the syntax here!
            if (element > max) max = element;
        }

        System.out.println("The highest score is " + max);
    }
}
