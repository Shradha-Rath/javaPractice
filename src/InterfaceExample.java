class InterfaceExample implements Variables
{
    public static void main(String args[])
    {
        InterfaceExample a= new InterfaceExample();
        System.out.println(a.count);
        System.out.println(Variables.sum);
        System.out.println(a.div);
        System.out.println(a.y);
    }
}
 interface Variables
{
     int count =8;
     int sum =4;
     int div =6;
    int y=9;

}