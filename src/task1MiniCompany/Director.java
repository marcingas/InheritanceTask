package task1MiniCompany;

import java.util.ArrayList;

public class Director extends Manager{
    ArrayList<Manager> myManagers = new ArrayList<>();

    public Director(String name, String surname, ArrayList<Manager> myManagers) {
        super(name, surname);
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
        return getClass().getSimpleName() + ": now I can rest, "+ manager +  " is working";
    }


}
