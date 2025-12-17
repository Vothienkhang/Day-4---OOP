public class Main_Circle {
    public static void main(String[] args) {

        // Tạo object
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);

        // In ra kết quả
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
    }
}
