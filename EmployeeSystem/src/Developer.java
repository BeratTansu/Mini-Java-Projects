public class Developer extends Employee {
    private String programmingLanguages;

    public Developer(String firstName, String lastName, int id, String programmingLanguages) {
        super(firstName, lastName, id);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Developer's programming languages: " + programmingLanguages);
    }

    public void formatComputer(String operatingSystem) {
        System.out.println(getFirstName() + " is installing " + operatingSystem + "...");
    }
}
