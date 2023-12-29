package Kyu7.FuctionalAddition;

import java.util.function.IntUnaryOperator;

public class Kata {

    public static void main(String[] args) {
        System.out.println(add(5));
    }

    public static IntUnaryOperator add(int n) {

        return result -> result + n;
    }
}
