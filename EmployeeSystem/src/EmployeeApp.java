import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Employee Management Application...");

        String menu =
                "Operations...\n" +
                        "1. Developer Operations\n" +
                        "2. Manager Operations\n" +
                        "Press 'q' to quit";
        System.out.println("--------------------------------------");
        System.out.println(menu);
        System.out.println("--------------------------------------");

        while (true) {
            System.out.print("Select an operation: ");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("q")) {
                System.out.println("Exiting the program...");
                break;
            } else if (operation.equals("1")) {
                Developer developer = new Developer("Berat", "Tansu", 10, "Python, Java");
                String devMenu =
                        "Developer Operations...\n" +
                                "1. Format Computer\n" +
                                "2. Show Information\n" +
                                "Press 'q' to go back";
                System.out.println(devMenu);

                while (true) {
                    System.out.print("Select a developer operation: ");
                    String devOp = scanner.nextLine();

                    if (devOp.equalsIgnoreCase("q")) {
                        System.out.println("Exiting Developer Operations...");
                        break;
                    } else if (devOp.equals("1")) {
                        System.out.print("Operating System: ");
                        String operatingSystem = scanner.nextLine();
                        developer.formatComputer(operatingSystem);
                    } else if (devOp.equals("2")) {
                        developer.showInfo();
                    } else {
                        System.out.println("Invalid developer operation!");
                    }
                }

            } else if (operation.equals("2")) {
                Manager manager = new Manager("Beratti", "Tansiu", 100, 10);
                String managerMenu =
                        "Manager Operations...\n" +
                                "1. Give Raise\n" +
                                "2. Show Information\n" +
                                "Press 'q' to go back";
                System.out.println(managerMenu);

                while (true) {
                    System.out.print("Select a manager operation: ");
                    String managerOp = scanner.nextLine();

                    if (managerOp.equalsIgnoreCase("q")) {
                        System.out.println("Exiting Manager Operations...");
                        break;
                    } else if (managerOp.equals("1")) {
                        System.out.print("How much raise do you want the manager to give? ");
                        int raiseAmount = scanner.nextInt();
                        scanner.nextLine(); // clear buffer
                        manager.giveRaise(raiseAmount);
                    } else if (managerOp.equals("2")) {
                        manager.showInfo();
                    } else {
                        System.out.println("Invalid manager operation!");
                    }
                }
            } else {
                System.out.println("Invalid operation!");
            }
        }
    }
}
