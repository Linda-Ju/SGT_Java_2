package lesson4.homework.stringtoint;

import java.math.BigInteger;

public class StringToInteger {
    public static int myAtoi(String s) {
        int integer = 0;
        String digits = s.replaceAll("[^0-9-]", "");
        if (digits.equals("")) {
            return integer;
        }
        BigInteger longResult = new BigInteger(digits);
        if (longResult.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) > 0) {
            return Integer.MAX_VALUE;
        }
        if (longResult.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) < 0) {
            return Integer.MIN_VALUE;
        }
        integer = Integer.parseInt(digits);
        return integer;
    }
}

