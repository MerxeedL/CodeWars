package Kyu5.LastDigitOfALargeNumber;

import java.math.BigInteger;

public class Kata {

    public static void main(String[] args) throws Exception {
        System.out.println(lastDigit(new BigInteger("10"), new BigInteger("10000000000")));
    }

//    public static int lastDigit(BigInteger n1, BigInteger n2) throws Exception {
//
//        double number1 = n1.doubleValue();
//        double number2 = n2.doubleValue();
//
//        double result = (Math.pow(number1, number2));
//
//        if(Double.isNaN(result)) {
//            throw(new Exception("NAN"));
//        } else if (Double.isInfinite(result)) {
//            throw (new Exception("INFINITE"));
//        }
//
//        BigInteger endpoint = BigDecimal.valueOf(result).toBigInteger();
//
//        String fullString = String.valueOf(endpoint);
//
//        String lastDigitInTheStringInString = fullString.substring(fullString.length() - 1);
//
//        int lastDigitInTheStringInInt = Integer.parseInt(lastDigitInTheStringInString);
//        System.out.println(lastDigitInTheStringInInt);
//
//        return lastDigitInTheStringInInt;
//    }

    public static int lastDigit(BigInteger n1, BigInteger n2) {
        if (n2.equals(BigInteger.ZERO)) {
            return 1;
        }

        int lastDigitOfA = n1.mod(BigInteger.TEN).intValue();
        int lastDigitOfB = n2.mod(BigInteger.valueOf(4)).intValue();

        if (lastDigitOfB == 0) {
            lastDigitOfB = 4;
        }
        return (int) Math.pow(lastDigitOfA, lastDigitOfB) % 10;
    }
}
