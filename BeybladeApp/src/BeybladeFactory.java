public class BeybladeFactory {

    public Beyblade produceBeyblade(String beybladeType) {

        if (beybladeType.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Blue Dragon", "Communication with Sacred Beast");

        } else if (beybladeType.equals("Dranza")) {
            return new Dranza("Kai", 600, 400, "Red Phoenix");

        } else if (beybladeType.equals("Drayga")) {
            return new Drayga("Ray", 800, 250, "White Tiger");

        } else if (beybladeType.equals("Draciel")) {
            return new Draciel("Max", 400, 1000, "Black Turtle");

        } else {
            return null;
        }
    }
}

