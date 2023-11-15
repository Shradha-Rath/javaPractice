class NestedClassExample {
    static int y = 8;

    public static void main(String[] args) {

   p.print();
    }

    static class NestedInnerClass {
        NestedInnerClass() {
            System.out.println(y);
        }
    }

    interface Printable {
        void print();

    }
    class Printer implements Printable
    {

        @Override
        public void print() {

        }
    }
     static Printable p=new Printable() {
        @Override
        public void print() {
        System.out.println("Java is my favourite language");
        }
    };
}
