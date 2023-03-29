package task2Cars;

public class MiddleVerCar extends BasicCar{
    private boolean climatronic;


    public boolean hasClimatronic() {
        return climatronic;
    }

    public MiddleVerCar() {
        super(true,true,true);
        this.climatronic = true;

    }

    @Override
    public String driveCar() {
        return super.driveCar();
    }
    public String radioOn(){
        return "radio is playing nice jazz music";
    }

    @Override
    public String toString() {
        return "\nMiddleCar version, has  basic equipment:" +
                "\n-DrivingWheel :" + hasDrivingWheel() +
                "\n-Glasses :" + hasGlasses() +
                "\n-FourWheels : " + hasFourWheels() + " \nPLUS: "+
                "\n-Climatronic:  " + climatronic;
    }
}
