
//------------------------------------
//        |              Fan                  |
//        ------------------------------------
//        | + SLOW: int = 1                   |
//        | + MEDIUM: int = 2                 |
//        | + FAST: int = 3                   |
//        ------------------------------------
//        | - speed: int                      |
//        | - on: boolean                     |
//        | - radius: double                  |
//        | - color: String                   |
//        ------------------------------------
//        | + Fan()                           |
//        | + getSpeed(): int                 |
//        | + setSpeed(speed: int): void      |
//        | + isOn(): boolean                 |
//        | + setOn(on: boolean): void        |
//        | + getRadius(): double             |
//        | + setRadius(radius: double): void |
//        | + getColor(): String              |
//        | + setColor(color: String): void   |
//        | + toString(): String              |
//        ------------------------------------


public class Fan {
    // Constant speed
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    // Fields
    private int speed;
    private boolean on = false;
    public double radius = 5;
    private String color = "blue";
    private String speedName () {
        if (speed == SLOW) return "SLOW";
        if (speed == MEDIUM) return "MEDIUM";
        if (speed == FAST) return "FAST";
        return "UNKNOWN";
    }

    // Constructor không tham số
    public Fan() {
    }

    // Getter & Setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    // toString: Phương thức toString() trả về chuỗi chứa thông tin của quạt.
    // Nếu quạt đang ở trạng thái on, phương thức trả về speed, color, và radius với chuỗi “fan is on”.
    // Nếu quạt không ở trạng thái on, phương thức trả về color, radius với chuỗi “fan is off”.

    @Override
    public String toString() {
        if (on) {
            return "Fan is on [speed=" + speed + ", speed=" + speedName() + ", radius=" + radius + ", color=" + color + "]";
        } else  {
            return "Fan is off [speed=" + speed + ", speed=" + speedName() + ", radius=" + radius + ", color=" + color + "]";
        }
    }
}
