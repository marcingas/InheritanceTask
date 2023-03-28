package task1MiniCompany;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker{
    private String name;
    private String surname;

    ArrayList<Worker> mySubordinates = new ArrayList<>();

    public Manager(String name, String surname, ArrayList<Worker> MySubordinates ) {
        super(name,surname);
        this.name = name;
        this.surname = surname;
        this.mySubordinates = MySubordinates;
    }

    public Manager(String name, String surname) {
        super(name, surname);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void doNormalJob() {
        super.doNormalJob();
        System.out.println("I still can do normal job! Hurra!");
    }

    public void doManagersJob(){
        System.out.println(getClass().getSimpleName()  + " " +this.name +
                ": Sometimes I work hard my managers job, when my people don't work. If they work I'm not working!");
    }
    public String pushTheWorker(Worker worker){
        worker.doNormalJob();
        return getClass().getSimpleName() +" "+ name +": job done, "+ worker + " is working! ";

    }


}
