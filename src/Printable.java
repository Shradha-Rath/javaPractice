interface Printable
{
  public void run();

}
interface Showable
{
    public void run();

}
class Printer implements Printable
{
   public  void run()

    {
        System.out.println("Running Printer");
    }
}
class Model implements Showable
{
   public void run()

    {
        System.out.println("model running");
    }
}

class CallMultipleInheritance implements Printable, Showable
{
   public void run()
    {
        System.out.println("Running");

    }

    public static void main(String args[])
    {
      Showable m = new Model();


    }
}

