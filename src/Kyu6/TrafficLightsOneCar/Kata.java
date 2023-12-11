package Kyu6.TrafficLightsOneCar;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {

    public static void main(String[] args) {

        lightOnTraffic("CRRRRYYYYGGGGGGGGGGGGGGGG..........G............................R.........");
        //System.out.println(Arrays.toString(trafficLights("C...R..........G............................R....", 25)));

    }

//    public static String[] trafficLights(String road, int n) {
//
//        char[] chars = road.toCharArray();
//        int i = 0;
//        int x = 10;
//
//        char C = 0;
//        int trafficLight = 0;
//
//        for (int j = 0; j < x; j++) {
//            if (i > 0) {
//                if (trafficLight == 5 && chars[i] == 'R') {
//                    road = road.replace('R', 'G');
//                    //chars[i] = 'G';
//                }
//                else if (chars[i] == '.') {
//                    chars[i] = 'C';
//                    chars[i - 1] = '.';
//                }
//            }
//            i++;
//            trafficLight++;
//            System.out.println(chars);
//        }
//
//        String value = new String(chars);
//        return new String[]{value};
//        }

    public static void lightOnTraffic(String road) {

        int i = 0;
        int green = 0;
        int yellow = 0;
        int red = 0;
        char[] chars = road.toCharArray();



        for (char chr : chars) {
            if (chr == 'G' && green < 5) {
                i++;
                System.out.println(chars);
                green++;
            } else {
                chars[chr] = 'Y';
                break;
            }
        }
        System.out.println(chars);
    }
}
