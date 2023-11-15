public class QapitolExample9 {
    public static void main(String[] args) {
        int num = 123321;
        int n = num;
        int reverse = 0;

        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;

        }
        if (num==reverse)
        {
            System.out.println("no is pallindrome  "+num);
        }
        else
        {
            System.out.println("no is not pallindrome  "+num);
        }
    }
}
