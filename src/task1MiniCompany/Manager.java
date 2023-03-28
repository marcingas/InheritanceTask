package task1MiniCompany;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker{

    ArrayList<Worker> mySubordinates = new ArrayList<>();

    public Manager(String name, String surname, ArrayList<Worker> MySubordinates ) {
        super(name, surname);
        this.mySubordinates = MySubordinates;
    }

    public Manager(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void doNormalJob() {
        super.doNormalJob();
        System.out.println("I still can do normal job! Hurra!");
    }

    public void doManagersJob(){
        System.out.println("Sometimes I work hard, when my people don't work. If they work I'm not working!");
    }
    public String pushTheWorker(Worker worker){
        worker.doNormalJob();
        return "job done, worker "+ worker + " is working! ";

    }
}