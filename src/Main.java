import task1MiniCompany.Director;
import task1MiniCompany.Manager;
import task1MiniCompany.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Worker john = new Worker("John","Kowalski");
        Worker poul = new Worker("Poul","Theworker");
        System.out.println("\nworkers do their job==============");
        john.doNormalJob();
        poul.doNormalJob();
        ArrayList<Worker> mySubordinates = new ArrayList<>();
        mySubordinates.add(john);
        mySubordinates.add(poul);

        Manager tytus = new Manager("Tytus","Piotrowski",mySubordinates);
        Manager romek = new Manager("Roman","Smith",mySubordinates);

        System.out.println("\nmanagers do normal and their job=========");

        tytus.doNormalJob();
        romek.doNormalJob();
        tytus.doManagersJob();
        romek.doManagersJob();
        System.out.println(tytus.pushTheWorker(john));



        ArrayList<Manager> myManagers = new ArrayList<>();
        myManagers.add(tytus);
        myManagers.add(romek);

        Director elon = new Director("Elon", "Musk",myManagers);

        System.out.println("\ndirector's job====================");

        elon.doNormalJob();
        elon.doManagersJob();
        System.out.println(elon.pushManager(tytus));

    }
}