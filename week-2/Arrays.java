public class Arrays {
    public static void main (String[] args) {
        // Here's how we declare an array
        int myArray[] = {1,2,3}; // We cannot mention the size here. Size gets fixed as 3.

        // Here's how we declare a matrix (as a 2D array)
        int matrix[][] = {{1,2},{3,4},{5,6},{7,8}};

        // Cloning an array
        int matrix2[][] = matrix.clone();

        // If we want to fix the size of the array
        int[] fixedSizeArray  = new int[10]; // anonymous array
        fixedSizeArray[0] = 1;

        /* 
        // ArrayIndexOutOfBoundsException: Caused when we try to access beyond the end of the array
        for (int i = 0; i <= 11; i++) {
            System.out.println(fixedSizeArray[i]);
        }

        for (int i = 0; i <= 11; i++) {
            System.out.println(myArray[i]); // Index 3 out of bounds
            System.out.println(matrix[i]); // Index 4 out of bounds
        }

        myArray[3] = 5; // Index 3 out of bounds
*/

        // Now, let's see how to pass Arrays into a function
        System.out.println("\nInitial Array: ");
        for (int i:myArray) {System.out.print(i);}

        int[] newArray = addArray(myArray);
        System.out.println("\nAdded Array: ");
        for (int j:newArray) {System.out.print(j);}
    }

    public static int[] addArray (int[] arrayArg){
        int[] newArray = new int[arrayArg.length];
        for (int i = 0; i < arrayArg.length; i++) {
            newArray[i] = arrayArg[i] + 1;
        }
        return newArray;
    }
}
