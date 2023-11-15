
//Print the days of week using switch case

import java.util.Scanner;

public class QapitolExample4 {
    public static void main(String[] args) {
       int day;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no ");
        day = s.nextInt();
        switch(day)
        {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;

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