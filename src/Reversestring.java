class ReverseString
{
    public static void main (String args[]) {
        String re = "";
        String str = "Shradha";
        for (int i = str.length() - 1; i >= 0; i--) {
            re = re + str.charAt(i);
        }

        System.out.println(re);

    }
}
//i=6,5
//re=a,