abstract class BeautyParlour {
    abstract void threading();

    abstract void manicure();

    abstract void waxing();

    abstract void payment();

    void delivery()
    {
        System.out.println("Deliver from Nykaa");
    }

}

 class Nykaa extends BeautyParlour {


     public void threading()
     {
         System.out.println("Threading from Nykaa");
     }

      public void manicure()
     {
         System.out.println("manicure from Nykaa");
     }

      public void waxing()
      {
          System.out.println("waxing from Nykaa");
      }

     public void payment()
      {
          System.out.println("Payment to Nykaa");
      }
      public void exchange()
      {
          System.out.println("Exchange pdt to Nykaa");
      }
}
class CallerBeauty
{
    public static void main (String args[])
    {
        BeautyParlour b = new Nykaa();
        b.threading();
        b.waxing();
        b.manicure();
        b.payment();
        b.delivery();
        Nykaa n= new Nykaa();
        n.exchange();

    }

}
