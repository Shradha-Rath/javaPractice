import java.util.*;

class SecondDimension {
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nos");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                arr[row][column] = sc.nextInt();

            }
        }
        printTwoDimensionArray(arr);

    }

    public static void printTwoDimensionArray(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {


                System.out.print(arr[row][column]+" ");
            }
            System.out.println();
        }

    }
}