package Katas7.HighestAndLowest.Kata;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Kata {

    public static void main(String[] args) {

        String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";

    }

    public static String highAndLow(String numbers) {

        IntSummaryStatistics stats = Arrays.stream(numbers.split("\\s")).
                mapToInt(Integer::parseInt).summaryStatistics();

        return String.format("%d %d", stats.getMax(), stats.getMin());

    }

}
