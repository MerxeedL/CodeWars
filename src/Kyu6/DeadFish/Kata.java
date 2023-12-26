package Kyu6.DeadFish;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }

    public static int[] parse(String data) {

        double value = 0;
        ArrayList<Integer> list = new ArrayList<>();

        char[] test = data.toCharArray();

        for (int j = 0; j < test.length; j++) {
            if (test[j] == 'i') {
                value++;
            } else if (test[j] == 'd') {
                value--;
            } else if (test[j] == 's') {
                value = Math.pow(value, 2);
            } else if (test[j] == 'o') {
                list.add((int) value);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
