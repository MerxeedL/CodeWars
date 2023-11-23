package Kyu7.VowelCount;

import java.util.ArrayList;

public class VowelCount {

    public static void main(String[] args) {
        System.out.println(VowelCount.getCounts("abracadabra"));
    }

    public static int getCounts(String str) throws IndexOutOfBoundsException {


        int count = 0;

        char[] letters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < letters.length; i++) {
            list.add(letters[i]);
        }

        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("test");
        return count;
    }
}
