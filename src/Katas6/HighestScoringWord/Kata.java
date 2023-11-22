package Katas6.HighestScoringWord;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.stream;
import static java.util.Comparator.comparing;

public class Kata {

    public static void main(String[] args) {

        String str = "what time are we climbing up to the volcano";
        System.out.println(high(str));

    }

    public static String high(String str) {

        return Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(word -> word.chars()
                        .map(charr -> charr - 96)
                        .sum()))
                        .get();



    }
}
