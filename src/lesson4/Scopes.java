package lesson4;

public class Scopes {
    static final int SOME_CONSTANT = 314;
    static int globalResult = 0;
    public static void main(String[] args) {
        int someNumber = SOME_CONSTANT;
        //pass the value as an argument to a method
        int someResult = multiplyByFive(someNumber);
        System.out.println(someResult);

        multiplyAndStoreGlobalVariable(15);
        multiplyByTwo(5);

        System.out.println("Global result " + globalResult);


    }

    static int scopeVisible(int someNumber) {
        boolean visibleInsideMethod = true;
        return someNumber * 2;
    }

    //do like this
    static int multiplyByFive(int number) {
        int five = SOME_CONSTANT;

        globalResult = number * five;
        return number * five;
    }

    //avoid using global variables
    static void multiplyAndStoreGlobalVariable(int number) {
        int five = SOME_CONSTANT;

        globalResult = number * five;
    }

    static void multiplyByTwo(int number) {
        int two = 2;

        globalResult = number * two;
    }
}
