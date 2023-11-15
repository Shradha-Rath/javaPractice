class ReverseExample
{
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("Lucky");
//        System.out.println(str.reverse());
//           String str= "Lucky";
//           String j ="";
//           for(int i = str.length()-1;i>=0;i--) {
//               j = j + str.charAt(i);
//           }
//           System.out.println(j);
////Shradhanjali Rath
       String s=" Shradhanjali Rath ";
        String p="";
//
//        System.out.println(s.trim());
//        System.out.println(s.substring(0,12));
//        for(int i=0;i<=s.length()-1;i++)
//        {
//            String ch = s.charAt(i)+"";
//            if((!ch.equals("a"))&&(!ch.equals("e")))
//
//            {
//                p=p+ch;
//
//            }
//
//        }
       // System.out.println(p);

       String a= s.replaceAll("a","");
         a= a.replaceAll("i","");
         System.out.println(a);
        System.out.println(s.replace("a",""));
        String d = "7978255992a";
        d = d.replaceAll("(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|0)([789]\\d{9})", "");
        System.out.println(d);
    }
}

// true and true -->true
//false and true --> false
// false or true --> true