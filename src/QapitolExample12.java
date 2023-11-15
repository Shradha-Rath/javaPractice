//Print odd and even no from the given integer 2736191902

public class QapitolExample12 {
    public static void main(String[] args) {
        int n=27361919;
        while(n!=0)
        {
            int remainder = n%10;
            if(remainder%2==0){
                System.out.println("Digit is even " +remainder);

            }
            else
            {
                System.out.println("Digit is odd " +remainder);
            }
            n=n/10;

        }

    }
}
