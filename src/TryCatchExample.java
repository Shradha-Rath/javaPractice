import java.io.IOException;

class TryCatchExample
{
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();

        }
//        catch(ArithmeticException e) {
//            System.out.println("Exception" +e);
//        }
        catch(Throwable s)
        {
            System.out.println("Different Exception" +s);
        }

        System.out.println("Rest of the code");
    }
}