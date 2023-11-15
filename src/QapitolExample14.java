//write java program for grandfather has Bungalow, Father having Apartment, Son has car crate object and display each property (inheritance example)

public class QapitolExample14 {
    public static void main(String[] args) {

        Son s = new Son();
        s.car();
        s.bunglow();
        s.Apartment();

    }
}

 class GrandFather
{
   public void bunglow()
   {
       System.out.println("I have a Bunglow");
   }
}
class Father extends GrandFather
{
    public void Apartment()
    {
        System.out.println("I have an Apartment");
    }
}
class Son extends Father
{
    public void car()
    {
        System.out.println("I have a car");
    }
}
