class Example2
{
    public static void main(String[] args) {

       int a=10, b=20;
       int c= add(a, b);
        System.out.println("The sum is " + c);
        a=100;
        b=200;
        System.out.println("value of a in main " + a);
        System.out.println("value of b  in main" + b);

    }


    private static int add(int a, int b) {
        System.out.println("value of a " + a);
        System.out.println("value of b " + b);
        return a+b;
    }

}