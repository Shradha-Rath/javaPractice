//inserting in the beginning
public class Example6 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = arr.length-1; i >0; i--)
        {
          arr[i]=arr[i-1];
        }
        arr[0]=1994;
        for(int j =0; j<arr.length;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
//i=4,arr[0]=arr[-1],
//arr=[1,2,3,4,4]
