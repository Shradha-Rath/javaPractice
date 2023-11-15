//Check No is palindrome or not 123321

public class QapitolExample8 {
    public static void main(String[] args) {
        String s = "123321";
        StringBuilder b = new StringBuilder(s);
        StringBuilder r =b.reverse();
        if(r.toString().equals(s))

        {
            System.out.println("Given No. is pallindrome ");
        }
        else
        {
            System.out.println("Given No. is not pallindrome ");
        }


    }
}
