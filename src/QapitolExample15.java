//write  programs for  method overloading and overriding

public class QapitolExample15 {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.gold();
        d.updateCash(89999999);
        d.updateCash(9000000, '€');
        GrandMother g = new GrandMother();
        g.gold();
    }
}

class GrandMother {
    public void gold() {
        System.out.println("I have 5 kgs of gold");
    }
}

class Mother extends GrandMother {
    public void gold() {
        System.out.println("I have 10 kgs of gold");
    }
}

class Daughter extends Mother {
    private int cash;
    private char currency;

    public void gold() {
        System.out.println("I have 15 kgs of gold");
    }

    public void updateCash(int cash) {
        this.cash = cash;
        System.out.println("I have cash " + cash);
    }

    public void updateCash(int cash, char currency) {
        this.cash = cash;
        this.currency = currency;
        System.out.println("I have cash " + cash + " in currency " + currency);
    }

}