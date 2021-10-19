package lesson8.task4and5;

public class Demo {
    static Rectangle r = new Rectangle(15, 10);
    static Square s = new Square(15);


    static Square squares[] = {new Square(2), new Square(3), new Square(4), new Square(5),
            new Square(6), new Square(7), new Square(8), new Square(9),
            new Square(10), new Square(11), new Square(12)};

    public static void main(String[] args) {
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());

        System.out.println(squares[0].calculateArea());
        System.out.println(squares[1].calculateArea());
        System.out.println(squares[2].calculateArea());
        System.out.println(squares[3].calculateArea());
        System.out.println(squares[4].calculateArea());
        System.out.println(squares[6].calculateArea());
        System.out.println(squares[7].calculateArea());
        System.out.println(squares[8].calculateArea());
        System.out.println(squares[9].calculateArea());
        System.out.println(squares[10].calculateArea());

    }


}
