public class Drayga extends Beyblade {
    private String sacredBeast;

    public Drayga(String bladerName, int rotationSpeed, int attackPower, String sacredBeast) {
        super(bladerName, rotationSpeed, attackPower);
        this.sacredBeast = sacredBeast;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sacred Beast Name: " + sacredBeast);
    }

    @Override
    public void revealSacredBeast() {
        System.out.println(getBladerName() + " is summoning " + sacredBeast + "...");
        System.out.println(getBladerName() + "'s Attack: Tiger Claw");
    }
}
