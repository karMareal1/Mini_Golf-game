import java.util.Scanner;

public class Input {
    private double startX;
    private double startY;
    private double startVX;
    private double startVY;
    private double angle;

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting X position of the ball:");
        startX = scanner.nextDouble();

        System.out.println("Enter the starting Y position of the ball:");
        startY = scanner.nextDouble();

        System.out.println("Enter the initial velocity (force) in the x direction of the ball:");
        startVX = scanner.nextDouble();

        System.out.println("Enter the initial velocity (force) in the y direction of the ball:");
        startVY = scanner.nextDouble();

        System.out.println("Enter the angle at which the ball is hit (in degrees):");
        angle = scanner.nextDouble();
    }
    public double getStartX(){
        return startX;
    }
    public double getStartY(){
        return startY;
    }
    public double getStartVX(){
        return startVX;
    }
    public double getStartVY(){
        return startVY;
    }
    public double getAngle(){
        return angle;
    }
}
