import java.util.Scanner;

public class QapitolExample1 {

    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        age = s.nextInt();
        if(age>=18)
        {
            System.out.println("User eligible for driving license  " +age);
        }
        else
        {
            System.out.println("User not eligible for driving license "+age);
        }


    }
}
