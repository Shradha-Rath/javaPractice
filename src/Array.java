import java.util.*;
class Array {
    public static void main(String args[]) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 no.");
        for (int i = 0; i <= 4; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        finalSum(arr);
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void finalSum(int arr[])
    {
        int sum =0;
        for(int j=0;j<arr.length;j++)
        {
            sum=sum+arr[j];

        }
        System.out.println("Sum of the no." +sum);
    }
}














//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 nos");
//        int sum = 0;
//        for(int i=1;i<=5;i++)
//        {
//            int input= sc.nextInt();
//            sum=sum+input;
//
//        }
//       System.out.println("sum of the nos"+ sum);
//        }




//    sum =0,1,3,6,10
//     i=1,2,3,4,5,6
//input=1,2,3,4
//1