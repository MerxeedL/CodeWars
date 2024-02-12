package Kyu5.GreedIsGood;


import java.util.Arrays;

public class Kata {


    public static void main(String[] args) {
        System.out.println(greedy(new int[]{5, 5, 1, 1, 3}));
    }

    public static int greedy(int[] dice) {

        int count = 0;
        int countOnes = 0;
        int countTwos = 0;
        int countThrees = 0;
        int countFours = 0;
        int countFives = 0;
        int countSixes = 0;

        Arrays.sort(dice);

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                countOnes++;
            } else if (dice[i] == 2) {
                countTwos++;
            } else if (dice[i] == 3) {
                countThrees++;
            } else if (dice[i] == 4) {
                countFours++;
            } else if (dice[i] == 5) {
                countFives++;
            } else if (dice[i] == 6) {
                countSixes++;
            }
        }

        if (countOnes == 4) {
            count += 1100;
        } else if (countOnes == 5) {
            count += 1200;
        } else if (countOnes == 3) {
            count += 1000;
        } else if (countOnes == 1) {
            count += 100;
        } else if (countOnes == 2) {
            count += 200;
        }

        if (countFives == 1) {
            count += 50;
        } else if (countFives == 2) {
            count += 100;
        } else if (countFives == 3) {
            count += 500;
        }

        if (countTwos == 3) {
            count += 200;
        } else if (countThrees == 3) {
            count += 300;
        } else if (countFours == 3) {
            count += 400;
        } else if (countSixes == 3) {
            count += 600;
        }

        if (countTwos == 4) {
            count += 200;
        } else if (countThrees == 4) {
            count += 300;
        } else if (countFours == 4) {
            count += 400;
        } else if (countFives == 4) {
            count += 550;
        } else if (countSixes == 4) {
            count += 600;
        }

        if (countTwos == 5) {
            count += 200;
        } else if (countThrees == 5) {
            count += 300;
        } else if (countFours == 5) {
            count += 400;
        } else if (countSixes == 5) {
            count += 600;
        }

        return count;

    }
}
