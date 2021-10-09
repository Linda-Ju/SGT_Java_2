package lesson4;

public class Initialization {
    public static void main(String[] args) {
        // bad example :D don't do like this
        String boopOrWoop; //pointing to NULL

        boopOrWoop = boop();

        // good. do like this
        String woopOrBoop = woop();
    }

    static String boop(){
        return "boop";
    }

    static String woop(){
        return "woop";
    }
}
