class ArrayAddition
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        int b[]={5,6,7,8};
        int c[]=new int[4];

        int i=0;
        int j= a.length-1;

        while(i>=0 && j<=4)
        {
             c[i]=a[i]+b[j];
            i++;
            j--;

        }
        for(int k=0;k<=a.length;k++)
        {
            System.out.print(c[k]);
        }






    }
}


//a=[1,2,3,4] b = [5,6,7,8]
// c=a[0]+b[3]
//c=[9,9,9,9]
