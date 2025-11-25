public class Beyblade {
    private String bladerName;
    private int rotationSpeed;
    private int attackPower;

    public Beyblade(String bladerName, int rotationSpeed, int attackPower) {
        this.bladerName = bladerName;
        this.rotationSpeed = rotationSpeed;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(getBladerName() + " is attacking with " + attackPower + " attack power and " + rotationSpeed + " rotation speed...");
    }

    public void revealSacredBeast() {
        System.out.println("This Beyblade does not have a sacred beast...");
    }

    public void showInfo() {
        System.out.println("Blader Name: " + bladerName);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Rotation Speed: " + rotationSpeed);
    }

    public String getBladerName() {
        return bladerName;
    }

    public void setBladerName(String bladerName) {
        this.bladerName = bladerName;
    }

    public int getRotationSpeed() {
        return rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
