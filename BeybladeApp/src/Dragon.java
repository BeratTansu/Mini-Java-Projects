public class Dragon extends Beyblade {
    private String sacredBeast;
    private String hiddenAbility;

    public Dragon(String bladerName, int rotationSpeed, int attackPower, String sacredBeast, String hiddenAbility) {
        super(bladerName, rotationSpeed, attackPower);
        this.sacredBeast = sacredBeast;
        this.hiddenAbility = hiddenAbility;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Sacred Beast Name: " + sacredBeast);
        System.out.println("Hidden Ability: " + hiddenAbility);
    }

    @Override
    public void revealSacredBeast() {
        System.out.println(getBladerName() + " is summoning " + sacredBeast + "...");
        System.out.println(getBladerName() + "'s Attack: Phantom Storm");
    }
}
