
import java.util.*;
class Main

// file name
{
    public static int calc(int x, int y,int operation)
    {
       if(operation == 1)
       {
           return x+y;

       }
       else if(operation == 2 )
       {
           return x-y;
       }
       else if (operation == 3)
       {
           return x*y;
       }
       else if (operation == 4)
       {
           return x/y;
       }
       else {
           System.out.println("Invalid operation type");
           return -1;

       }

    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("select operation");
        System.out.println("select 1 for addition" );
        System.out.println("select 2 for subtraction" );
        System.out.println("select 3 for multiplication" );
        System.out.println("select 4 for division" );

        int operation = sc.nextInt();

        System.out.println("Enter first no");
        int firstNo= sc.nextInt();

        System.out.println("Enter second no");
        int secondNo= sc.nextInt();

       int result= calc(firstNo,secondNo,operation);

        System.out.println("result = "+result);

    }
}
