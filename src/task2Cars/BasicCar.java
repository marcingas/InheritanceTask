package task2Cars;

public class BasicCar {
    private boolean drivingWheel;
    private boolean glasses;
    private boolean fourWheels;

    protected boolean hasDrivingWheel() {
        return drivingWheel;
    }

    protected boolean hasGlasses() {
        return glasses;
    }

    protected boolean hasFourWheels() {
        return fourWheels;
    }

    public BasicCar() {
        drivingWheel = true;
        glasses = true;
        fourWheels = true;
    }

    public String driveCar() {
        return "Engine is on, I can ride my brand new : " + toString();
    }

    @Override
    public String toString() {
        return "\nBasicCar, has equipment:" +
                "\n-DrivingWheel :" + drivingWheel +
                "\n-Glasses :" + glasses +
                "\n-FourWheels : " + fourWheels;
    }
}
