package Kyu6.DeadFish;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiiso")));
    }

    public static int[] parse(String data) {

        int value = 0;
        int[] endpoint = new int[0];
        int[] secondpoint = new int[endpoint.length + 1];

        char[] test = data.toCharArray();

        for (int j = 0; j < test.length; j++) {
            if(test[j] == 'i') {
                value++;
            }
            else if(test[j] == 'd') {
                value--;
            } else if (test[j] == 's') {
                value = (int) Math.sqrt(value);
            } else if (test[j] == 'o') {
                secondpoint[secondpoint.length-1] = value;
            }
        }

        return secondpoint;

    }

}
