//write simple java program for constructor overloading with employee details like id,Phone no,Name,Salary,Designation

public class QapitolExample13 {
    private long phoneNumber;
    private int salary;
    private String name;
    private String id;
    private String designation;

    QapitolExample13(String id, int salary, String name, String designation, long phoneNumber) {
        this.id = id;
        this.salary = salary;
        this.designation = designation;
        this.phoneNumber = phoneNumber;
        this.name = name;
        System.out.println("constructor 1 called" + " id " + id + " Salary " + salary + " designation " + designation + " phoneNumber " + phoneNumber + " name " + name);
    }


    QapitolExample13(String id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        System.out.println("Constructor 2 called" +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}');
    }

    public static void main(String[] args) {

        QapitolExample13 q = new QapitolExample13("AB1234", 100000, "shradha");
        QapitolExample13 y = new QapitolExample13("AB14", 10000, "lucky", "Scientist", 9438524260l);


    }
}
