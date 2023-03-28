package task1MiniCompany;

import java.util.ArrayList;

public class Director extends Manager{
    private String name;
    private String surname;
    ArrayList<Manager> myManagers = new ArrayList<>();

    public Director(String name, String surname, ArrayList<Manager> myManagers) {
        super(name, surname);
        this.name = name;
        this.surname = surname;
        this.myManagers = myManagers;

    }

    @Override
    public void doNormalJob() {
        super.doNormalJob();
    }

    @Override
    public void doManagersJob() {
        super.doManagersJob();
    }
    public String pushManager(Manager manager){
        manager.doManagersJob();
        return getClass().getSimpleName() + " " + name +": now I can rest, "+ manager +  " is working";
    }


}
