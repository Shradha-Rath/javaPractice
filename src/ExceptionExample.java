import java.util.Scanner;

class ExceptionExample
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no");
        int c =s.nextInt();
        int x= s.nextInt();

        try {
            add();
//            if ((c > 0)&&(x<-2)) {
//                throw new Exception("Positive no exception");
//            } else {
//                throw new Exception("not a positive no. exception");
//            }
        }
        catch(Exception e)
        {
            System.out.println("Exception " +e);

        }
        finally
        {
            System.out.println("Rest of the code");
        }

    }
   static void add() throws ArithmeticException
    {
        int d=100/0;
    }
}
