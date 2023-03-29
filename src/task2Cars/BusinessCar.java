package task2Cars;

public class BusinessCar extends MiddleVerCar {

    private boolean parkAssistant;

    public BusinessCar() {
        super();
        parkAssistant = true;
    }

    public String autoparkModeOn() {
        return "Your park assistant already parked your car in thin spot";
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
                "\n FourWheels : " + hasFourWheels() + " \nPLUS: " +
                "\nClimatronic:  " + hasClimatronic() +
                "\npark Assistant: " + parkAssistant;
    }
}
