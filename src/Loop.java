class Loop {
    public static void main(String args[]) {
        int i;
        //for while do while
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(".....");
        int y = 1;
        while (y <= 10) {
            System.out.println(y);
            y = y + 1;
        }
        System.out.println("****");
        int x = 1;
        do {
            System.out.println(x);
            x = x + 1;

        } while (x >= 10);

    }
}


