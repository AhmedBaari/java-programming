public class JaggedArrays {

    public static void main(String[] args) {
        // Create a jagged array with 3 rows
        int[][] jaggedArray = new int[][]{
            {1, 2, 3},
            {4, 5},
            {6}
        };

        // Print the first element in the first row
        System.out.println("First Row: " + jaggedArray[0][0]);

        // Print the number of elements in the first row
        System.out.println("Number of elements in first row: " + jaggedArray[0].length);

        // Print the number of elements in the second row
        System.out.println("Number of elements in second row: " + jaggedArray[1].length);

        // Print the total number of elements in the jagged array
        System.out.println("Sum of elements: " + sum(jaggedArray));
    }

    public static int sum(int[][] jaggedArray) {
        int sum = 0;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                sum += jaggedArray[i][j];
            }
        }
        return sum;
    }
}
