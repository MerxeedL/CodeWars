package Kyu5.HumanReadebleTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Kata {

    public static void main(String[] args) throws ParseException {
        System.out.println(makeReadable(86399));
    }


    public static String makeReadable(int seconds) {

        int anHourInSeconds = 3600;
        int aMinuteInSeconds = 60;

        String hh = Integer.toString(seconds / anHourInSeconds);
        String mm = Integer.toString((seconds % anHourInSeconds) / aMinuteInSeconds);
        String ss = Integer.toString(seconds% aMinuteInSeconds);

        if(hh.length() == 1) {
            hh = "0" + hh;
        }

        if(mm.length() == 1) {
            mm = "0" + mm;
        }

        if(ss.length() == 1) {
            ss = "0" + ss;
        }

        return hh + ":" + mm + ":" + ss;

    }
}
