class Calculator {
    static int a;
    static int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

     int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public float divide() {
        if (b != 0) {
            return ((float) a / b);
        } else {
            return -1;
        }
    }
        public static int mod () {
            if (b != 0) {
                return (a % b);
            } else {
                return -1;
            }
        }


    }
    class CallerClass
    {
        public static void main (String args[])
        {
            Calculator c = new Calculator(8, 0);
            System.out.println("Sum of the nos is:" + c.add());
            System.out.println(c.subtract());
            System.out.println(c.multiply());
            System.out.println(c.divide());
            System.out.println(Calculator.mod());
            System.out.println(Calculator.a);
            System.out.println(Calculator.b);
        }
    }
