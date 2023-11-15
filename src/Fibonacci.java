class Fibonacci
{
    public static void main(String args[])
    {
        int a = 0;
        int b=1;
        int c=0;
        for(int i=1;i<=3;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;

        }
// a=0,b=1,c=0
// | c=1,a=1,b=1 | c=2,a=1,b=2 | c=3,a=2,b=3
        //

        //0,1,1


    }
}
// 0,1,1,2,3,5,8
//a,b,c
// a,b,c

