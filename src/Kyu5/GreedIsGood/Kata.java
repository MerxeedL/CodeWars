package Kyu5.GreedIsGood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {


    public static void main(String[] args) {
        System.out.println(greedy(new int[]{5, 1, 3, 4, 1}));
    }

    public static int greedy(int[] dice) {

        int count = 0;
        final int thousand = 1000;
        final int sixHundred = 600;
        final int fiveHundred = 500;
        final int fourHundred = 400;
        final int threeHundred = 300;
        final int twoHundred = 200;
        final int oneHundred = 100;
        final int fifty = 50;

        Arrays.sort(dice);

        List<Integer> test = new ArrayList<>();

        for (int i = 0; i < dice.length; i++) {
            for (int j = i + 1; j < dice.length; j++) {
                for (int k = i + 2; k < dice.length; k++) {
                    if (dice[i] == dice[j] && dice[j] == dice[k] && !test.contains(dice[i])) {
                        test.add(dice[i]);
                        if (dice[i] == 1) {
                            count += thousand;
                        } else if (dice[i] == 2) {
                            count += twoHundred;
                        } else if (dice[i] == 3) {
                            count += threeHundred;
                        } else if (dice[i] == 4) {
                            count += fourHundred;
                        } else if (dice[i] == 5) {
                            count += fiveHundred;
                        } else if (dice[i] == 6) {
                            count += sixHundred;
                        }
                    }
                }
            }
            if (dice[i] == 1) {
                count += oneHundred;
            } else if (dice[i] == 5) {
                count += fifty;
            }
        }
        return count;
    }
}
