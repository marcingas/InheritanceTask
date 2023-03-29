package task2Cars;

public class MiddleVerCar extends BasicCar{
    private boolean climatronic;


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
        return "\nYour BasicCar has:" +
                "\nDrivingWheel :" + hasDrivingWheel() +
                "\n Glasses :" + hasGlasses() +
                "\n FourWheels : " + hasFourWheels() +
                "\nClimatronic:  " + climatronic;
    }
}
