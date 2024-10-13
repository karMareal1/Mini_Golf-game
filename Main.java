import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Mini Golf!");
        Scanner scanner = new Scanner(System.in);

        // Set initial ball position and velocity
        System.out.println("Enter initial x position of the ball: ");
        double startX = scanner.nextDouble();
        System.out.println("Enter initial y position of the ball: ");
        double startY = scanner.nextDouble();
        System.out.println("Enter initial velocity in x direction: ");
        double initialVelX = scanner.nextDouble();
        System.out.println("Enter initial velocity in y direction: ");
        double initialVelY = scanner.nextDouble();

        // Create a Formulas object to handle physics calculations
        Formulas ball = new Formulas(startX, startY, initialVelX, initialVelY);
        double velocity = ball.calc_velocity();  // Call calc_velocity()
        System.out.println("The velocity of the ball is: " + velocity);
        double distance_to_hole = ball.calc_distance_to_hole(initialVelY, velocity);
        System.out.println("Here is the distance to the ball: " + distance_to_hole);
        System.out.println("Here is the time it took you to get to this position(2.5) in seconds: " + ball.calc_time(2.5));
        System.out.println("Nice shot, now lets see if you hit a wall or not: " + ball.detect_ball_collision(5, 4));

    }
}
