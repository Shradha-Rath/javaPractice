//input 5no from user and calculate there avg and print there avg
import java.util.*;
class Average
{
    public static void main (String args[])
    {
        int avg=0;
        int sum=0;
        int arr[] = { 1,2,3,4,5};
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];

        }
        avg=sum/arr.length;
        System.out.println(avg);
    }
}