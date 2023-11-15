import java.util.*;

class Revision {
    public static void main(String args[]) {
        checkOddEven();
    }

    public static void checkOddEven() {
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input % 2 == 0) {
            System.out.println("No. is even ");
        } else {
            System.out.println("No. is odd ");
        }
    }
}


