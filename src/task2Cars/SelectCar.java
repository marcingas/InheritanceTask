package task2Cars;

public class SelectCar {
    public static void main(String[] args) {

        System.out.println("\nBasic selected: ");

        BasicCar car = new BasicCar();
        System.out.println(car.driveCar());

        System.out.println("\nMiddle selected: ");

        MiddleVerCar car2 = new MiddleVerCar();
        System.out.println(car2.driveCar());
        System.out.println(car2.radioOn());

        System.out.println("\nBusiness selected: ");

        BusinessCar car3 = new BusinessCar();
        System.out.println(car3.driveCar());
        System.out.println(car3.autoparkModeOn());
        System.out.println(car3.radioOn());

    }
}
