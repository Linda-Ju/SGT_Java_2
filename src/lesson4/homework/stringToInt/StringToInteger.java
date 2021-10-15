package lesson4.homework.stringToInt;

import java.math.BigInteger;

public class StringToInteger {
    public static int myAtoi(String s) {
        int integer = 0;
        String digits = s.replaceAll("[^0-9-]", "");
        if (digits.equals("")) {
            return integer;
        }
        BigInteger longResult = new BigInteger(digits);
        if (longResult.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) == 1) {
            return Integer.MAX_VALUE;
        }
        if (longResult.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) == -1) {
            return Integer.MIN_VALUE;
        }
        integer = Integer.parseInt(digits);
        return integer;
    }
}

