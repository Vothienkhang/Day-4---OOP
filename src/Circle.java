//[Bài tập] Access modifier

//Circle
//--------------------
//- radius: double = 1.0   (private)
//- color: String = "red"  (private)
//--------------------
//+ Circle()
//+ Circle(double radius)
//+ getRadius(): double
//+ getArea(): double

public class Circle {

    private double radius = 1.0;
    private String color= "red";

    // Constructor
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Method
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
