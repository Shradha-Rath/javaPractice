class Logic
{
    public static void main (String args[])
    {
        int i;
        for( i=1;i<=20;i++)
        {
            if(i%3==0 && i%5!=0)
            {
                System.out.println(i);
            }
        }
        //to call a function
        even();

    }
    public static void even ()
    {
        int i;
        for( i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

    }

    public static void ond() {
        int i;
        for (i = 1; i <= 20; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void or () {
        int i;
        for (i = 1; i <= 20; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
        //to call a function
        even();
    }
}