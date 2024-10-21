import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mini Golf!");
        Scanner scanner = new Scanner(System.in);

        Input input = new Input();
        input.getUserInput();

        double angleInRadians = Math.toRadians(input.getAngle());

        // Split the velocity into X and Y components using the angle
        double velocityX = input.getStartVX() * Math.cos(angleInRadians);
        double velocityY = input.getStartVY() * Math.sin(angleInRadians);

        Formulas ball = new Formulas(input.getStartX(), input.getStartY(), velocityX, velocityY);

        System.out.println("Here is the velocity of your ball: " + ball.calc_velocity());

        /* 
        // Set initial ball position and velocity
        System.out.println("Enter initial x position of the ball: ");
        double startX = scanner.nextDouble();
        System.out.println("Enter initial y position of the ball: ");
        double startY = scanner.nextDouble();
        System.out.println("Enter initial velocity in x direction: ");
        double initialVelX = scanner.nextDouble();
        System.out.println("Enter initial velocity in y direction: ");
        double initialVelY = scanner.nextDouble();
        */

        // Create a Formulas object to handle physics calculations
        double distance_to_hole = ball.calc_distance_to_hole(input.getStartVY(), ball.calc_velocity());
        System.out.println("Here is the distance to the ball: " + distance_to_hole);
        System.out.println("Here is the time it took you to get to this position(2.5) in seconds: " + ball.calc_time(2.5));
        System.out.println("Nice shot, now lets see if you hit a wall or not: " + ball.detect_ball_collision(5, 4));

    }
}
