// Fan.java
public class Fan {
    // Data fields
    private int speed;
    private String color;
    private boolean power;

    // Static values for speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Default constructor
    public Fan() {
        this.speed = SLOW; // default speed is slow
        this.color = "white"; // default color is white
        this.power = false; // default power is off
    }

    // Method to display all attributes
    public String displayAll() {
        if (power) {
            return "Speed: " + speed + ", Color: " + color + ", Power: " + power;
        } else {
            return color + " Fan is off!";
        }
    }

    // Setters for speed, color, and power
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}