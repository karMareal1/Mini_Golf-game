# Mini_Golf-game
Hello, This is Kareem Taher. I am working on a simple yet complicated physics mini_golf game. I already took AP physics and I wanted to apply what I learned (in Mechanics) to coding!
Here are some of the functions that can be used when creating a Formulas object:
1. calc_velocity(): Returns a double number, which is the velocity of the ball.

2. calc_time(double current_position_x): Requires a parameter of the current position of the ball in x direction, and it returns a double number indicating the time it takes the ball to reach that position in seconds.

3. calc_new_position_y(double current_position_x): requires the a double paramter of the current position of the ball in the y direction, and it returns a double number indicating the new position of the ball in terms of y.

4. calc_new_position_x(double current_position_x): requires the a double paramter of the current position of the ball in the x direction, and it returns a double number indicating the new position of the ball in terms of x.

5. calc_new_velocity(double acceleration, double time): requires the time it takes the ball and the balls acceleration in order to find the final velocity that it the ball hits.

6. detect_ball_collision(double wallX, double wallY): requires the height of the wall as well as the width of the ball, and it returns a boolean value (true or false) that indicates if the ball collided in any way with the wall.

7. apply_gravity_on_slope(double slopeAngle, double time): requires the slope of the hill and the time it takes to go up or down the hill, and this function applies gravity and does not return anything but adjust the intial velocity of the x and y

8. reflect_velocity(boolean horizontalCollision, boolean verticalCollision): takes in a boolean value of whether there was  horizontal collison or vertical collison and does not return anything but change the sign of the x and y velocities

9. calc_distance_to_hole(double holeX, double holeY): takes in the coordinates of the x and y and then returns the distance from the ball to the hole.

10. reset_position(double newX, double newY): takes in the coordinates of the x and y position and then resets all the variables with these new adjustments.