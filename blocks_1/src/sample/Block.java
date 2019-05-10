package sample;

public class Block {
    private double speed = 0;
    private double mass = 0;
    private double location = 0;

    /** Basic constructor
     * @param inputSpeed: starting speed of the block (per second)
     */
    public Block(double inputSpeed, double inputMass, double startLocation) {
        speed = inputSpeed;
        mass = inputMass;
        location = startLocation;
    }

    /** update function
     * @param elapsedTime: the number of miliseconds since the last update
     */
    public void update(double elapsedTime) {
        location += speed * elapsedTime;
    }

    /**
     * Reverse the speed because the block has collided
     * with something (perfectly inelastic
     */
    public void collide() {
        speed = speed * -1;
    }

    public double getLocation(){
        return location;
    }
}
