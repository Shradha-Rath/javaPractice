import java.util.Scanner;

public class QapitolExample3 {

    public static void main(String[] args) {
        int marks;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks in percentage");
        marks = s.nextInt();
        switch (marks / 10) {
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


        ////90-100 --> O  95/10= 9.5=9
        ////80-89 --> E
        ////70-79 --> A
        ////60-69 --> B
        ////50-59 --> C
        ////40-49 --> D
        ////Less than 40 --> F95/10= 9.5=9


    }


}



