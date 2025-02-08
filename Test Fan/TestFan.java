// TestFan.java
public class TestFan {
    public static void main(String[] args) {
        // Create a Fan object that is turned off
        Fan fan1 = new Fan();
        fan1.setPower(false); // Fan is off

        // Create a Fan object that is turned on
        Fan fan2 = new Fan();
        fan2.setPower(true); // Fan is on
        fan2.setSpeed(Fan.FAST); // Set speed to fast
        fan2.setColor("black"); // Set color to black

        // Display the attributes of both fans
        System.out.println(fan1.displayAll()); // Should indicate the fan is off
        System.out.println();
        System.out.println(fan2.displayAll()); // Should display speed, color, and power
    }
}