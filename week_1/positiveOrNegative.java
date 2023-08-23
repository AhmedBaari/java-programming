class positiveOrNegative {
    public static void main(String[] args) {
        // Declaring a random number
        int num = (int) (Math.random() * 10);
        System.out.println("Random Number: " + num + "\n");

        if (num > 0) {
            System.out.print(num + " is Positive");
        } else if (num == 0) {
            System.out.print(num + " is Zero");
        } else {
            System.out.print(num + " is Negative");
        }
    }
}
