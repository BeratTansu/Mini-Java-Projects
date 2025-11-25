public class Manager extends Employee {
    private int numberOfPeopleInCharge;

    public Manager(String firstName, String lastName, int id, int numberOfPeopleInCharge) {
        super(firstName, lastName, id);
        this.numberOfPeopleInCharge = numberOfPeopleInCharge;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Number of people the manager is responsible for: " + numberOfPeopleInCharge);
    }

    public void giveRaise(int amount) {
        System.out.println(getFirstName() + " is giving a raise of " + amount + " TL to the employees.");
    }
}
