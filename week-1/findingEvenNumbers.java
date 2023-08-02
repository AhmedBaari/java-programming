class findingEvenNumbers {
    // We will be finding even numbers from 1 to 100
    public static void main(String[] args) {
        int i;
        System.out.println("Even numbers from 1 to 100: ");
        for (i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
