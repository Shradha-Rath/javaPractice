class string {
    public static void main(String args[]) {
        String s = "Shradhanjali Rath  ";
        // String str= new String("Apple");
        //substring = give staring and end index :
        s.length();

        System.out.println(s.length());
        System.out.println(s.substring(13, s.length()));
        //indexOf= gives index of the characters
        s.indexOf("jali");
        System.out.println(s.indexOf("jali"));
        System.out.println(s.lastIndexOf("jali"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim().length());
        //trim removes spaces from beginning and end

        //comparing to strings
        String a = "Tom";
        String b = "Tom";
        if (a.equals(b)) {
            System.out.println("True");
            ;
        } else {
            System.out.println("False");

        }
        String c="Shinchan";

        System.out.println(c);
        //sString pool : when same variable is used it creates a reference in the memory
        String d= "Shinchan";
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        //hashcode gives memory location of an object. it uniquely identifies an object

       s.charAt(2);
        System.out.println(s.charAt(2));
    }


}
