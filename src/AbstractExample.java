class AbstractExample extends Abstraction
{
    public static void main(String args[])
    {
        AbstractExample a= new AbstractExample();
        System.out.println(a.count);
        System.out.println(Abstraction.sum);
        System.out.println(a.div);
        System.out.println(a.y);
        a.print();
    }
}
abstract class Abstraction implements Printing
{
    final int count =2;
    static int sum =4;
    final static int div =6;
    int y=9;
    public void print()
    {
        System.out.println("Print it");
    }

}
interface Printing {
    public void print();
}
