package Katas5.SimplePigPlatin;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Kata {

    public static void main(String[] args) {

        System.out.println(pigIt("Pig latin is cool"));

    }

    public static String pigIt(String str) {

        if (str == null || str.isEmpty()) {
            return null;
        }

        final String[] words = str.split("\\s");
        final StringBuilder sb = new StringBuilder();

        for (String s : words)
            if (Pattern.matches("\\p{IsPunctuation}", s)) {
                sb.append(s).append(" ");
            } else {
                sb.append(s.substring(1)).append(s.charAt(0)).append("ay ");
            }
        while (sb.charAt(sb.length()-1) == ' ') {
            sb.setLength(sb.length()-1);
        }
        return new String(sb);
    }
}

