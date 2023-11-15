import java.util.Scanner;

public class QapitolExample5 {
    public static void main(String[] args) {
        float marks;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks in percentage");
        marks = s.nextFloat();
        if(marks<0 || marks>100)
        {
            System.out.println("Enter valid marks");
            return ;
        }
        int range =(int)(marks/10);

        switch (range) {
            case 10:

            case 9:
                System.out.println("Grade is O");
                break;
            case 8:
                System.out.println("Grade is E");
                break;
            case 7:
                System.out.println("Grade is A");
                break;
            case 6:
                System.out.println("Grade is B");
                break;
            case 5:
                System.out.println("Grade is C");
                break;
            case 4:
                System.out.println("Grade is D");
                break;
            default:
                System.out.println("Grade is F");
        }
    }
}
