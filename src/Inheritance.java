class Animal
{
    // eat food , activities,appearance
    public void eat()
    {
       System.out.println("Animal is eating food");
    }
    public void walk()
    {
        System.out.println("Animal is walking");
    }
    public void talk()
    {
        System.out.println("Animal is barking");
    }
}
class Dog extends Animal
{
    public void eat()
    {
        System.out.println("Dog is eating food");
    }
    public void walk()
    {
        System.out.println("Dog is walking");
    }
    public void talk()
    {
        System.out.println("Dog is barking");
    }

}
class Pomerian extends Dog
{
  public void appearance()
  {
      System.out.println("Appearance is cute");
  }
}

class Caller
{
    public static void main (String args[])
    {
        Dog d = new Dog();
        d.walk();
        d.talk();
        d.eat();
        Pomerian p= new Pomerian();
        p.appearance();

    }
}