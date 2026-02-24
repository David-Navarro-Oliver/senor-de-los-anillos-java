package lotr.races;

import lotr.model.LotrCharacter;

public class Elf extends LotrCharacter {

    private int visionRange;

    public int getVisionRange() {
        return visionRange;
    }

    public void setVisionRange(int visionRange) {
        this.visionRange = visionRange;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Raza: Elfo");
        System.out.println("Rango de visión: " + visionRange);
    }
}