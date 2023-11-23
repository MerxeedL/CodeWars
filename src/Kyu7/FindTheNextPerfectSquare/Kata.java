package Kyu7.FindTheNextPerfectSquare;

public class Kata {

    public static void main(String[] args) {

       findNextSquare(9, 5000);

    }

    public static long findNextSquare(int test, int max_value) {

        for (int i = 0; i < max_value; i++) {

            if(test == (Math.sqrt(test) * Math.sqrt(test))) {
                return test;
            } else return -1;
        }

        System.out.println(test);
        return (long) test;
    }
}
