package lesson4.homework.romannumerals;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = scanner.nextInt();
        System.out.println(RomanNumerals.intToRoman(input));
    }

    public static String intToRoman(int number) {
        int[] arabicNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNum = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        for (int i = 0; i < arabicNum.length; i++) {
            int numberOfSymbols = number / arabicNum[i];
            if (numberOfSymbols != 0) {
                result += romanNum[i].repeat(numberOfSymbols);
                number %= arabicNum[i];
            }
        }
        return result;
    }
}