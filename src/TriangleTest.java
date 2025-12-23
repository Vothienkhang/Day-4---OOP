import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side1: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side2: ");
        double side2 = scanner.nextDouble();

        System.out.println("Enter side3: ");
        double side3 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter color: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("\n--- Triangle info ---");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
