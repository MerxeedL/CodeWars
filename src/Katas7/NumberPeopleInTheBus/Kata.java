package Katas7.NumberPeopleInTheBus;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kata {

    public static void main(String[] args) {

        ArrayList<int[]> stops = new ArrayList<>();
        stops.add(new int[] {10,3});
        stops.add(new int[] {3,5});
        stops.add(new int[] {2,5});
        System.out.println(countPassengers(stops));
        countPassengers(stops);

}
    public static int countPassengers(ArrayList<int []> stops) {

        int peopleIn = 0;
        int peopleOut = 0;

        for (int i = 0; i < stops.size(); i++) {
            peopleIn += stops.get(i)[0];
            peopleOut += stops.get(i)[1];
        }
        return peopleIn - peopleOut;
    }
}
