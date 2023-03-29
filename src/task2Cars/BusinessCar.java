package task2Cars;

public class BusinessCar extends MiddleVerCar {

    private boolean parkAssistant;

    public BusinessCar() {
        super();
        parkAssistant = true;
    }

    public String autoparkModeOn() {
        return "Auto Park assistant is On. \nYou have your car parked in narrow spot already";
    }

    @Override
    public String radioOn() {
        return super.radioOn();
    }

    @Override
    public String toString() {
        return "\nBusiness version, has  middle equipment:" +
                "\nDrivingWheel :" + hasDrivingWheel() +
                "\n Glasses :" + hasGlasses() +
                "\n FourWheels : " + hasFourWheels() +
                " \nPLUS: " +
                "\nClimatronic:  " + hasClimatronic() +
                "\nPark Assistant: " + parkAssistant;
    }
}
