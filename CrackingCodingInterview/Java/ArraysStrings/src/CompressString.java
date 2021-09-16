package src;

public class CompressString {
    public static String compress_string(String txt) {
        char old = txt.charAt(0);
        int count = 1;
        String result = "";

        for (int i = 1; i < txt.length(); i++) {
            if (old == txt.charAt(i))
                count += 1;
            else {
                result += old;
                result += String.valueOf(count);
                old = txt.charAt(i);
                count = 1;
            }
        }

        result += old;
        result += String.valueOf(count);

        return txt.length() <= result.length() ? txt : result;
    }
}
