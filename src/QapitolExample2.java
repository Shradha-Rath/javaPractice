import java.util.Scanner;

public class QapitolExample2 {

    public static void main(String[] args) {
        float marks;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks in percentage");
        marks = s.nextFloat();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade is O");
        }
        else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade is E");
        }
        else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade is A");
        }
        else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade is B");
        }
        else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade is C");
        }
        else if (marks >= 40 && marks <= 49) {
            System.out.println("Grade is D");
        }
        else {
            System.out.println("Grade is F");
        }


    }
}
//90-100 --> O
//80-89 --> E
//70-79 --> A
//60-69 --> B
//50-59 --> C
//40-49 --> D
//Less than 40 --> F