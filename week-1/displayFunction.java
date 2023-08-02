class displayFunction {
    public final int i = 10;
    public static void main (String[] args) {
        Second S = new Second();
        S.disp();
    }
}

class Second {
    public final int i = 100;
    void disp() {
        System.out.println(i);
    }
}