import java.util.*;

class Jewellery {
    int userChoice;
    String userMsg = "";

    Jewellery(int userChoice) {
        this.userChoice = userChoice;
        if (userChoice == 1) {
            userMsg = "Gold";
        }
        if (userChoice == 2) {
            userMsg = "Silver";
        }
        if (userChoice == 3) {
            userMsg = "Diamond";
        }
        if (userChoice == 4) {
            userMsg = "Platinum";
        }
    }

    public void makeJewellery() {
        System.out.println("Jewellery is made from " + userMsg);

    }

    public void sellJewellery() {
        System.out.println("Jewellery sold is of " + userMsg);
    }


}


class Customer {
    public static void main(String args[]) {
        System.out.println("Enter jewellery material type \n 1 = Gold \n 2= Silver \n 3= Diamond \3n 4= Platinum ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        Jewellery j = new Jewellery(input);
        j.makeJewellery();
        j.sellJewellery();

    }
}


//Enter yor choice 1= gold 2=silver 3 = diamond 4 = platinum
//2
//o/p- silver jewellery is delivered