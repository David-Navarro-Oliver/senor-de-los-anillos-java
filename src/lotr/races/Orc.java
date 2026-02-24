package lotr.races;

import lotr.model.LotrCharacter;

public class Orc extends LotrCharacter {

    private boolean sunlightWeakness;

    public Orc() {
        super();
    }

    public boolean isSunlightWeakness() {
        return sunlightWeakness;
    }

    public void setSunlightWeakness(boolean sunlightWeakness) {
        this.sunlightWeakness = sunlightWeakness;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Raza: Orc");
        System.out.println("Debilidad a la luz solar: " + (sunlightWeakness ? "Sí" : "No"));
    }
}