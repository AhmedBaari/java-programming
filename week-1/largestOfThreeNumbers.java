class largestOfThreeNumbers {
    public static void main(String[] args) {
        // Get input for 3 numbers
        int a = 13;
        int b = 12;
        int c = 14;

        // Process the maximum
        int largest = (a >= b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The largest number is " + largest);
    }

}
