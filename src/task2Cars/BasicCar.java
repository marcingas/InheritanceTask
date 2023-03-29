package task2Cars;

public class BasicCar {
    private boolean DrivingWheel;
    private boolean Glasses;
    private boolean FourWheels;

    public boolean hasDrivingWheel() {
        return DrivingWheel;
    }

    public boolean hasGlasses() {
        return Glasses;
    }

    public boolean hasFourWheels() {
        return FourWheels;
    }
    public BasicCar(){}
    public BasicCar(boolean drivingWheel, boolean glasses, boolean fourWheels) {
        DrivingWheel = drivingWheel;
        Glasses = glasses;
        FourWheels = fourWheels;
    }
    public String driveCar(){
        return "Engine is on, I can ride my brand new : " + toString();
    }

    @Override
    public String toString() {
        return "\nBasicCar, has equipment:" +
                "\n-DrivingWheel :" + DrivingWheel +
                "\n-Glasses :" + Glasses +
                "\n-FourWheels : " + FourWheels;
    }
}
