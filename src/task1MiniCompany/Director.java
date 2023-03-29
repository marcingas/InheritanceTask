package task1MiniCompany;

import java.util.ArrayList;
import java.util.List;

public class Director extends Manager{

    private List<Manager> myManagers = new ArrayList<>();

    public Director(String name, String surname, List<Manager> myManagers) {
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
        return "Director " + getName() +": now I can rest, "+ manager +  " is working";
    }
    public void pushManagers(List<Manager>managersList){
        for(Manager manager : managersList){
            System.out.println("Director Elon: " + manager.getName() + " go to work!");
            manager.doManagersJob();
            System.out.println("Finally, " + manager.getName() + " is working now! ");
        }
    }


}
