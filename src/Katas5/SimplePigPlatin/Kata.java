package Katas5.SimplePigPlatin;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {

        System.out.println(pigIt("Pig latin is cool"));

    }

    public static String pigIt(String str) {

        for (int i = 0; i < str.length(); i++) {
            char[] values = new char[]{str.charAt(i)};

            if (str.contains(" ") | str.contains(",") | str.contains(".")) {
                str = str.replace(".", "");
                str = str.replace(",", "");
            }
            System.out.println(values);
        }



        return str;
    }

}
