package task1MiniCompany;

import task1MiniCompany.Director;
import task1MiniCompany.Manager;
import task1MiniCompany.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Worker john = new Worker("John","Kowalski");
        Worker poul = new Worker("Poul","Theworker");
        Worker jim = new Worker("Jim","Slowworker");
        Worker ann = new Worker("Ann","Roberts");

        System.out.println("\nworkers do their job==============");
        jim.doNormalJob();
        ann.doNormalJob();
        john.doNormalJob();
        poul.doNormalJob();

        List<Worker> tytusSubordinates = new ArrayList<>();
        tytusSubordinates.add(john);
        tytusSubordinates.add(poul);
        tytusSubordinates.add(jim);

        List<Worker> romekSubordinates = new ArrayList<>();
        romekSubordinates.add(ann);

        Manager tytus = new Manager("Tytus","Piotrowski",tytusSubordinates);
        Manager romek = new Manager("Roman","Smith",romekSubordinates);

        System.out.println("\nmanagers do normal and their job=========");

        tytus.doNormalJob();
        romek.doNormalJob();

        tytus.doManagersJob();
        romek.doManagersJob();

        System.out.println("\nPush all workers:=========== ");

        tytus.pushTheWorkers(tytusSubordinates);
        romek.pushTheWorkers(romekSubordinates);



        List<Manager> myManagers = new ArrayList<>();
        myManagers.add(tytus);
        myManagers.add(romek);

        Director elon = new Director("Elon", "Musk",myManagers);

        System.out.println("\ndirector's job====================");

        elon.doNormalJob();
        elon.doManagersJob();

        elon.pushManagers(myManagers);

    }
}