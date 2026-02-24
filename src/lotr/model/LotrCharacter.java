package lotr.model;

public class LotrCharacter {

    private String name;
    private int age;
    private String weapon;
    private String realm;
    private String faction;
    private int powerLevel;
    private String specialItem;
    private boolean isAlive;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getSpecialItem() {
        return specialItem;
    }

    public void setSpecialItem(String specialItem) {
        this.specialItem = specialItem;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public LotrCharacter() {
    }

    public void printDetails() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Arma: " + weapon);
        System.out.println("Reino: " + realm);
        System.out.println("Facción: " + faction);
        System.out.println("Nivel de poder: " + powerLevel);
        System.out.println("Objeto especial: " + specialItem);
        System.out.println("Está vivo: " + (isAlive ? "Sí" : "No"));
    }

}
