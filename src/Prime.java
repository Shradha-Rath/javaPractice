class Prime {
    public static void main(String[] args) {

        int i = 1;
        int count = 0;
        int input = 10;
        for (i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("The no is prime");
        } else {
            System.out.println("The no is not prime");
        }

    }
}




