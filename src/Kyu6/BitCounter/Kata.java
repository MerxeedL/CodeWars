package Kyu6.BitCounter;

public class Kata {

    public static void main(String[] args) {

        int n = 76;

        countBits(n);

    }

    public static int countBits(int n) {
        int value = 0;

        String toBinary = Integer.toBinaryString(n);

        for (int i = 0; i < toBinary.length(); i++) {

            if(toBinary.charAt(i) == '1') {
                value++;
            }
        }
        System.out.println(value);

        return value;
    }

}
