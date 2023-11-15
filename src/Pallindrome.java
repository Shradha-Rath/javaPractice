class Palindrome {
    public static void main(String args[]) {
//        StringBuilder s = new StringBuilder("MOM");
//        System.out.println(s.reverse());
//
////        if (s.reverse() .equals(s) )
////        {
////            System.out.println("The String is Palindrome");
////        }
////        else
////        {
////            System.out.println("The String is not Palindrome");
////        }
        String name = "MADAM";

        int i=name.length()-1;
        String j="";
        while (i>=0)
        {
          j= j+name.charAt(i);
            i--;


        }
        if (j.equals(name) )
        {
            System.out.println(name+"  is Palindrome  " );
        }
        else
        {
            System.out.println(name+"  is not Palindrome  ");
        }
    }

}
