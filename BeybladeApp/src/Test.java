import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        System.out.println("Welcome to the Beyblade Program...");
        System.out.println("Press Q to exit...");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Which Beyblade would you like to produce? ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")){
                System.out.println("Exiting the program...");
                break;
            } else {
                BeybladeFactory factory = new BeybladeFactory();
                Beyblade beyblade = factory.produceBeyblade(input);

                if (beyblade == null){
                    System.out.println("Please enter a valid Beyblade name...");
                } else {
                    beyblade.showInfo();
                    beyblade.attack();
                    beyblade.revealSacredBeast();
                }
            }
        }
    }
}
