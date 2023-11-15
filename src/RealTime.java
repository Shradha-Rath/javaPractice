import java.io.IOException;

class RealTime
{
    public static void main(String[] args) {
        try {
            int i = 100 / 0;
        }
        catch(RuntimeException e)
        {
            System.out.println("Exception is" +e);

        }
        System.out.println("Rest of the code..");
    }
}