public class Formulas {
    private double start_x;
    private double start_y;
    private double intial_velX;
    private double intial_velY;

    public Formulas(double x, double y, double intia_velX, double intia_velY){
        start_x = x;
        start_y = y;
        intial_velX = intia_velX;
        intial_velY = intia_velY;
    }

    public double calc_velocity(){
        return Math.sqrt(intial_velX * intial_velX + intial_velY * intial_velY);;
    }

    public double calc_time(double current_position_x){
        return (current_position_x - start_x) / intial_velX;
    }
    public double calc_new_position_y(double current_position){
        double time = calc_time(current_position_x);
        return intial_velY * time + start_y - 0.5 * 9.8 * time * time;  // Accounts for gravity
    }
    public double calc_new_position_x(double current_position){
        double time = calc_time(current_position_x);
        return intial_velX * time + start_x;
    }
    public double calc_new_velocity(double acceleration, double time) {
        return intial_velX + acceleration * time;
    }
    public boolean detect_ball_collision(double wallX, double wallY){
        if (start_x <= wallX || start_y <= wallY){
            return true;
        }
        return false;
    }    
    public void reflect_velocity(boolean horizontalCollision, boolean verticalCollision) {
        if (horizontalCollision) {
            intial_velY = -intial_velY;  // Reverse Y velocity after horizontal wall collision
        }
        if (verticalCollision) {
            intial_velX = -intial_velX;  // Reverse X velocity after vertical wall collision
        }
    }
}
