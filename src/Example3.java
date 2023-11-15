public class Example3 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i%3==0){
                continue;

            }
            if(i%2==0)
            {
                System.out.println("No is even  " +i);
            }
        }
    }
}
