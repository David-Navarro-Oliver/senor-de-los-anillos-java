package lotr.races;

import lotr.model.LotrCharacter;

public class Dwarf extends LotrCharacter {

    private int endurance;

    public Dwarf() {
        super();
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Raza: Enano");
        System.out.println("Resistencia: " + endurance);
    }
}