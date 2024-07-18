import java.util.Scanner;

public class TestTriangle {
    public static void main(String[]args) {
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Enter Side1: ");
        double side1 = scanIn.nextDouble();

        System.out.print("Enter Side2: ");
        double side2 = scanIn.nextDouble();

        System.out.print("Enter Side3: ");
        double side3 = scanIn.nextDouble();

        System.out.print("Enter a color of Triangle: ");
        String color = scanIn.next();

        System.out.print("The Triangle is filled?? true or false?? ");
        boolean filled = scanIn.nextBoolean();

        Triangle createTriangle = new Triangle(side1, side2, side3);
        createTriangle.setColor(color);
        createTriangle.setFilled(filled);

        System.out.print("The area of yours Triangle is ");
        System.out.println(createTriangle.getArea());

        System.out.print("The perimeter of yours Triangle is ");
        System.out.println(createTriangle.getPerimeter());

        System.out.print("The color of yours Triangle is ");
        System.out.println(createTriangle.getColor());

        System.out.print("Is yours Triangle filled? ");
        System.out.println(createTriangle.isFilled());
    }
}
