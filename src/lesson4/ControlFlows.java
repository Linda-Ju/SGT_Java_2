package lesson4;

public class ControlFlows {
    //BRANCHING STATEMENT
    public static void main(String[] args) {
        int myAge = 31;
        // SIMPLE IF STATEMENT
        if (myAge > 64) {
            System.out.println("Retirement time");
        } else if (myAge < 7) {
            System.out.println("Kindergarten time");
        } else {
            System.out.println("Work time");
        }

        //SWITCH STATEMENT

        switch (myAge) {
            case 5:
                System.out.println("Five years old");
                break;
            case 31:
                System.out.println("31 y o");
                break;
            case 55:
                System.out.println("55 y o");
                break;
            default:
                System.out.println("non-mentioned age");
        }
    }
}
