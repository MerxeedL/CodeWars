package Kyu5.HumanReadebleTime;

import java.text.DecimalFormat;
import java.util.Date;

public class Kata {

    public static void main(String[] args) {
        System.out.println(makeReadable(60));
    }

    public static String makeReadable(int seconds) {

        DecimalFormat dF = new DecimalFormat("##");
        dF.applyPattern("00");
        int result = 0;

        int hrs = seconds / 3600;
        int valuetestminutes = seconds - hrs * 3600;
        int minutes = valuetestminutes / 60;
        int secs = valuetestminutes - (minutes * 60);

        Date date = new Date();

        String test = System.out.printf("%tH:%tM:%tS", date, date, date).toString();

        return test;
    }

}
