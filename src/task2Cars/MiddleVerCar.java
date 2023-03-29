package task2Cars;

public class MiddleVerCar extends BasicCar {
    private boolean climatronic;


    protected boolean hasClimatronic() {
        return climatronic;
    }

    public MiddleVerCar() {
        super();
        this.climatronic = true;

    }

    @Override
    public String driveCar() {
        return super.driveCar();
    }

    public String radioOn() {
        return "Radio is on. Now is playing nice jazz music";
    }

    @Override
    public String toString() {
        return "\nMiddleCar version, has  basic equipment:" +
                "\n-DrivingWheel :" + hasDrivingWheel() +
                "\n-Glasses :" + hasGlasses() +
                "\n-FourWheels : " + hasFourWheels() +
                " \nPLUS: " +
                "\n-Climatronic:  " + climatronic;
    }
}
