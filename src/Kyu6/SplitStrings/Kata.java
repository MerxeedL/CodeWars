package Kyu6.SplitStrings;

import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("TestIsHere")));

    }

    public static String[] solution(String s) {

        StringBuilder test = new StringBuilder(s);

        if (s.length() % 2 != 0) {
            test.append("_");
        }

        s = test.toString();

        String[] value =  s.split("(?<=\\G.{2})");

        return value;

    }

}
