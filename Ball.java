public class Ball {
    private double x;
    private double y;
    private double velocityX;
    private double velocityY;
    private String color;
    private int mass;

 public Ball(double startX, double startY){
    x = startX;
    y = startY;
    velocityX = 0;
    velocityY = 0;
    velocity = 0;
    color = "Red";
    mass = 5;
 }
 
 public double CalculateVelocity(double VX, double VY){
    return Math.sqrt(VY^2 + VX^2);
 }

}

