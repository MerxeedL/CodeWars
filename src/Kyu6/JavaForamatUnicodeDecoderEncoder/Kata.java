package Kyu6.JavaForamatUnicodeDecoderEncoder;

public class Kata {

    public static void main(String[] args) {
        System.out.println(encode("hola"));
        System.out.println(decode("\\u05e6\\u0dcd\\u04df\\u0ddf\\u02b3\\u0bc6\\u0862"));
    }

    public static String encode (String input) {

        char[] chars = input.toCharArray();

        String value = "";

        for (char ch : chars) {
            value += String.format("\\u%04x", (int) ch);
        }
        return value;
    }

    public static String decode (final String input) {
        String value = input.split(" ")[0];

        value = input.replace("\\", "");
        String[] array = value.split("u");
        String text = "";

        for (int i = 1; i < array.length; i++) {
            int nextVal = Integer.parseInt(array[i], 16);
            text += (char)nextVal;
        }
        return text;
    }

}
