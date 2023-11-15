//Print Max and Min value given interger  2415617

public class QapitolExample11 {
    public static void main(String[] args) {
        int n = 2415617;
     // Gives the range of integers
                System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int max =Integer.MIN_VALUE ;
        int min =Integer.MAX_VALUE;

        while (n!=0)
        {
            int remainder=n%10;

            if (max<remainder) {
                max = remainder;
            }
            if(min>remainder)
            {
                min = remainder;

            }
         n =n/10;

        }
        System.out.println(max);
        System.out.println(min);

    }
}
