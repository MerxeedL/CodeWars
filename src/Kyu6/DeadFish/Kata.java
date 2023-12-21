package Kyu6.DeadFish;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }

    public static int[] parse(String data) {

        double value = 0;
        int[] endpoint = new int[0];
        int[] secondpoint = new int[endpoint.length + 1];
        int[] endvalue = new int[secondpoint.length + 1];
        String testzxc = null;

        char[] test = data.toCharArray();

        for (int j = 0; j < test.length; j++) {
            if (test[j] == 'i') {
                value++;
            } else if (test[j] == 'd') {
                value--;
            } else if (test[j] == 's') {
                value = Math.pow(value, 2);
            } else if (test[j] == 'o') {
                System.out.println((int) value);
                secondpoint[secondpoint.length - 1] = (int) value;
            }

            for (int i = 0; i < secondpoint.length - 1; i++) {
              endvalue[i] = (int) value;
                //System.out.println(Arrays.toString(endvalue));
            }

        }
        return secondpoint;
    }
}
