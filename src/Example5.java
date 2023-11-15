public class Example5 {
    public static void main(String[] args) {
        int arr[] = new int[8];

        //inserting values to empty array
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = i;
        }
        //finding last empty space
         int position =0;
        for (int k =arr.length-1 ; k >=0; k--) {

            if (arr[k]!= 0) {

               position=k;
               break;
            }

        }
        //inserting value to the last empty space
        arr[position+1]=6;
        //to print the final array
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);


        }
    }
}
