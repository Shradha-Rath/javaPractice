class InvertedPattern
{
    public static void main (String args[])
    {
        for (int i=1;i<=3;i++)
        {
            for(int j=3; j>=i;j--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}


//    ***
//    **
////  *

//i=1,2,3
//j=3,2,1,0/3,2,1/3,2
//pattern
//***
//**
//*





