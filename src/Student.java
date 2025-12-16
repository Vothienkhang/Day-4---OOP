// [Thực hành] Static Method

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    // constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // static method to change the value of static variable
    static void change() {
        college = "KHANG University";
    }

    // method to display value
    void display() {
        System.out.println("Roll no: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}
