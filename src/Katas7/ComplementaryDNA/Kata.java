package Katas7.ComplementaryDNA;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {

        System.out.println(makeComplement("ATTGC"));

    }

    public static String makeComplement(String dna) {

        char[] chars = dna.toCharArray();
        int i = 0;

        for (char chr: chars) {
            if(chr == 'A') {
                chars[i] = 'T';
            } else if (chr == 'T') {
                chars[i] = 'A';
            } else if (chr == 'G') {
                chars[i] = 'C';
            } else if (chr == 'C') {
                chars[i] = 'G';
            }
            i++;
        }
        String value = new String(chars);
        return value;
    }

}
