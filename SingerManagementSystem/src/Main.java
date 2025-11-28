import java.util.Scanner;

public class Main {

    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void printOperations() {
        System.out.println("\t 0 - View Operations");
        System.out.println("\t 1 - View Singers");
        System.out.println("\t 2 - Add Singer");
        System.out.println("\t 3 - Update Singer");
        System.out.println("\t 4 - Remove Singer");
        System.out.println("\t 5 - Search Singer");
        System.out.println("\t 6 - Quit Application");
    }

    public static void viewSingers() {
        singers.printSingers();
    }

    public static void addSinger() {
        System.out.println("Enter the name of the singer you want to add: ");
        String name = scanner.nextLine();
        singers.addSinger(name);
    }

    public static void updateSinger() {
        System.out.println("Enter the position of the singer you want to update (1-based): ");
        int position = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the new name for the singer: ");
        String name = scanner.nextLine();

        singers.updateSinger(name, position - 1);
    }

    public static void removeSinger() {
        System.out.println("Enter the position of the singer you want to remove (1-based): ");
        int position = scanner.nextInt();
        scanner.nextLine();
        singers.removeSinger(position - 1);
    }

    static void searchSinger() {
        System.out.println("Enter the name of the singer you want to search for: ");
        String name = scanner.nextLine();
        singers.searchSinger(name);
    }

    public static void main(String[] args) {
        System.out.println("\t Welcome to the Singer Application...");

        printOperations();

        boolean isRunning = true;

        System.out.println("***********************************");
        while(isRunning){
            System.out.println("Select an Operation: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from 0 to 6.");
                scanner.nextLine();
                continue;
            }

            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation){
                case 0:
                    printOperations();
                    break;
                case 1:
                    viewSingers();
                    break;
                case 2:
                    addSinger();
                    break;
                case 3:
                    updateSinger();
                    break; // Missing break statement fixed here
                case 4:
                    removeSinger();
                    break;
                case 5:
                    searchSinger();
                    break;
                case 6:
                    System.out.println("Exiting Application...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Operation. Please select a number from 0 to 6.");
                    break;
            }

        }
    }
}