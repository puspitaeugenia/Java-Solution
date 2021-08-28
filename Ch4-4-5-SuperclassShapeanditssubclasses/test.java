public class test {
    public static void main(String[] args) {
        //Tester Shape Class
        Shape s1 = new Shape();
        System.out.print("Shape (1): ");
        System.out.println(s1.toString());
        System.out.print("Shape (1) color changes to yellow: ");
        s1.setColor("yellow");
        System.out.println(s1.toString());
        Shape s2 = new Shape("black", false);
        System.out.print("Shape (2): ");
        System.out.println(s2.toString());
        System.out.print("Shape (2) fill changes to filled: ");
        s2.setFilled(true);
        System.out.println(s2.toString());

        //Tester Circle Class
        Circle c1 = new Circle();
        System.out.print("\nCircle 1 : ");
        System.out.println(c1.toString());
        System.out.printf("Area = %.2f%n", c1.getArea());
        System.out.printf("Perimeter = %.2f%n", c1.getPerimeter());


        System.out.print("Circle 2: ");
        Circle c2 = new Circle(7);
        System.out.println(c2.toString());
        System.out.printf("Area = %.2f%n", c2.getArea());
        System.out.printf("Perimeter = %.2f%n", c2.getPerimeter());

        //Tester Rectangle Class
        Rectangle r1 = new Rectangle();
        System.out.print("\nRectangle 1 : ");
        System.out.println(r1.toString());
        System.out.printf("Area = %.2f%n", r1.getArea());
        System.out.printf("Perimeter = %.2f%n", r1.getPerimeter());

        Rectangle r2 = new Rectangle(4, 7.5);
        System.out.print("Rectangle 2 : ");
        System.out.println(r2.toString());
        System.out.printf("Area = %.2f%n", r2.getArea());
        System.out.printf("Perimeter = %.2f%n", r2.getPerimeter());

        //Tester Square Class
        Square sq1 = new Square();
        System.out.print("\nSquare 1 : ");
        System.out.println(sq1.toString());
        System.out.printf("Side = %.2f%n", sq1.getSide());

        Square sq2 = new Square(10);
        System.out.print("Square 2 : ");
        System.out.println(sq2.toString());
        System.out.printf("Side = %.2f%n", sq2.getSide());

        Square sq3 = new Square(16, "Blue", true);
        System.out.print("Square 3 : ");
        System.out.println(sq3.toString());
        System.out.printf("Side = %.2f%n", sq3.getSide());
    }
}
