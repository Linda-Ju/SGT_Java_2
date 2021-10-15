package lesson4.homework.stringtoint;

import lesson4.homework.stringtoint.StringToInteger;

public class TestStringToInteger {
    public static void main(String[] args) {
        TestStringToInteger test = new TestStringToInteger();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
        test.scenario5();
        test.scenario6();
        test.scenario7();
        test.scenario8();
    }

    void scenario1() {
        int expected = 98993489;
        int actual = StringToInteger.myAtoi("98993489");
        assertThatEqual(expected, actual, "Convert positive number. Result: " + actual);
    }

    void scenario2() {
        int expected = 0;
        int actual = StringToInteger.myAtoi("This is not an integer");
        assertThatEqual(expected, actual, "Empty string. Result: " + actual);
    }

    void scenario3() {
        int expected = -1234567;
        int actual = StringToInteger.myAtoi("-1234567");
        assertThatEqual(expected, actual, "Convert negative number. Result: " + actual);
    }

    void scenario4() {
        int expected = 2147483647;
        int actual = StringToInteger.myAtoi("999999999999999999999999999");
        assertThatEqual(expected, actual, "Cast integer MAX VALUE. Result: " + actual);
    }

    void scenario5() {
        int expected = -2147483648;
        int actual = StringToInteger.myAtoi("-999999999999999999999999999");
        assertThatEqual(expected, actual, "Cast integer MIN VALUE. Result: " + actual);
    }

    void scenario6() {
        int expected = 123;
        int actual = StringToInteger.myAtoi("123abc");
        assertThatEqual(expected, actual, "String with letters at the end to integer. Result: " + actual);
    }

    void scenario7() {
        int expected = 123;
        int actual = StringToInteger.myAtoi("abc123");
        assertThatEqual(expected, actual, "String with letters at the beginning to integer. Result: " + actual);
    }

    void scenario8() {
        int expected = 123;
        int actual = StringToInteger.myAtoi("00123");
        assertThatEqual(expected, actual, "String with leading zeros. Result: " + actual);
    }

    void assertThatEqual(int expected, int actual, String description) {
        if (expected == actual) {
            System.out.println("[TEST OK]: " + description);
        } else {
            System.out.println("[TEST FAILED]: " + description + ". Expected " + expected + ", but was " + actual);
        }
    }
}
