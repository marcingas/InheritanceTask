package task1MiniCompany;

public class Worker {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Worker(){

    }

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void doNormalJob(){
        System.out.println("Worker " + getName() +": i'm doing slowly my normal job everyday, try to avoid my superior");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +" "+  name+ " " + surname;
    }
}
