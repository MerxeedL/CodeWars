package Kyu4.TheObservedPIN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheObservedPINTest {

    public static void main(String[] args) {
        System.out.println(getPINTs("02"));
    }

    public static List<String> getPINTs(String observed) {

        char[] test = observed.toCharArray();
        System.out.println(test);

        List<String> list = new ArrayList<>();
        int value = Integer.parseInt(Arrays.toString(test));

        if (value == 1) {
            list.add("2");
            list.add("4");
            list.add("1");
        }

        if (value == 2) {
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("5");
        }

        if(value == 3) {
            list.add("2");
            list.add("3");
            list.add("6");
        }

        if(value == 4) {
            list.add("1");
            list.add("4");
            list.add("5");
            list.add("7");
        }

        if(value == 5) {
            list.add("2");
            list.add("4");
            list.add("5");
            list.add("6");
            list.add("8");
        }

        if (value == 6) {
            list.add("3");
            list.add("5");
            list.add("6");
            list.add("9");
        }

        if (value == 7) {
            list.add("4");
            list.add("7");
            list.add("8");
        }

        if(value == 8) {
            list.add("5");
            list.add("7");
            list.add("8");
            list.add("9");
            list.add("0");
        }

        if (value == 9) {
            list.add("6");
            list.add("9");
            list.add("8");
        }

        if (value == 0) {
            list.add("0");
            list.add("8");
        }

        return list;
    }

}
