// concat two array which you get as an input
// eg: a[]={1,2,3} b[]={4,5,6} = c[]=a[]+b[] o/p = c[]={5,7,9}

class Concat {
    public static void main(String args[]) {
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};
        int c[] = new int[3];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(c[j] +" ");
        }
    }
}