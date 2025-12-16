public class Main_Student {
    public static void main(String[] args) {
        Student.change(); // call change method

        // create objects
        Student st1 = new Student(111, "Khang1");
        Student st2 = new Student(222, "Khang2");
        Student st3 = new Student(333, "Khang3");

        // call display method
        st1.display();
        st2.display();
        st3.display();
    }
}
