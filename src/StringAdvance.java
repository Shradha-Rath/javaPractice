class StringAdvance {
    public static void main(String args[]) {

        String con="";
        String d = "Doraemon";
        String s = "Shinchan";
        //o/p- dsohrianecmhoann
        for (int i = 0; i < d.length(); i++) {
            con=con+d.charAt(i)+s.charAt(i);

        }
        System.out.println(con);

    }
}