package Lecture5.HW;

public class Sage {
   private String name;


    public Sage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void sageEats(Fork leftFork, Fork rightFork) {
        System.out.println("Sage " + name + " is eating. " + leftFork.toString() + " and " + rightFork.toString() + " are occupied");
    }

    public void sageMeditates() {
        System.out.println(name + " is meditating");
    }
}
