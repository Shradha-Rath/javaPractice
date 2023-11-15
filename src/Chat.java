import java.util.regex.Matcher;
import java.util.regex.Pattern;




class Chat {
    public static void main(String[] args) {
        String d = "7978255992a";
        Pattern pattern = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|0)([789]\\d{9})$");
        Matcher matcher = pattern.matcher(d);

        if (matcher.find()) {
            d = matcher.replaceAll("");
        }

        System.out.println(d);
    }
}