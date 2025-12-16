//[Bài tập] Xây dựng lớp Fan

//Mô tả: Thiết kế lớp Fan to để mô tả về cái quạt.

public class Main_Fan {
    public static void main(String[] args) {

        // Fan 1
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("red");
        fan1.setRadius(10);
        fan1.setOn(true);

        // Fan 2
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.SLOW);
        fan2.setColor("green");
        fan2.setRadius(5);
        fan2.setOn(false);

        // In ra kết quả
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
