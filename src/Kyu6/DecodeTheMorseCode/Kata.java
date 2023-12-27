package Kyu6.DecodeTheMorseCode;

import java.util.Arrays;

public class Kata {


    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }

    public static String decode(String morseCode) {

        final char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?'};

        final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
                "--..--", ".-.-.-", "..--.."};

        String[] letters = morseCode.split(" ");

        String str = "";

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < english.length + 2; j++) {
                if (morseCode.charAt(j - 2) == ' ' && morseCode.charAt(j - 1) == ' '  && morseCode.charAt(j) == ' ') {
                    english[j] = ' ';
                } else if (morse[j].equals(letters[i])) {
                    str += english[j];
                    break;
                }
            }
        }
        morseCode = str;
        morseCode = morseCode.toUpperCase();
        return morseCode;
    }
}
