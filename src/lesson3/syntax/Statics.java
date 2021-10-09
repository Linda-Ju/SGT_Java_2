package lesson3.syntax;

public class Statics {
    public Statics (String name){
        this.name = name;
    }
    private String name = "Li";
    private static String surname;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Statics statics = new Statics ("Li");
        System.out.println("name " + statics.getName());
    }
}
