import java.util.Random;

public class ArrayUtil {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] createArray(int size) {
        int b[] = new int[size];
        return insertRandomValuesToArray(b);

    }

    public static int[] insertRandomValuesToArray(int k[]) {
        Random r = new Random();
        for (int i = 0; i < k.length; i++)
        {
            k[i]=r.nextInt(10);

        }
          return k;
    }
}
