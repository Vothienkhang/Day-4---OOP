package Shape;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        CircleTest[] circles = new CircleTest[3];
        circles[0] = new CircleTest(3.6);
        circles[1] = new CircleTest();
        circles[2] = new CircleTest(3.5, "Indigo", false);

        System.out.println("Pre-sorted:");
        for (CircleTest circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-Sorted:");
        for (CircleTest circle : circles) {
            System.out.println(circle);
        }
    }
}
