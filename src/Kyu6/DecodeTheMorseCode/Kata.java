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
                ',', '.', '?', '!'};

        final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----",
                "--..--", ".-.-.-", "..--..", "--..--"};

        String[] letters = morseCode.split("\\s{3,}");
        StringBuilder decoderText = new StringBuilder();

        for(String word : letters) {
            String[] chars = word.trim().split("\\s+");
            for(String letter: chars) {
                for (int j = 0; j < morse.length; j++) {
                    if(morse[j].equals(letter)) {
                        decoderText.append(english[j]);
                        break;
                    }
                }
            }
            decoderText.append(" ");
        }

        return decoderText.toString().toUpperCase().trim();
    }
}
