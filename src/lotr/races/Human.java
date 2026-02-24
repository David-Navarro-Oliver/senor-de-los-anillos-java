package lotr.races;

import lotr.model.LotrCharacter;

public class Human extends LotrCharacter {

    private int leadership;

    public Human() {
        super();
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Raza: Humano");
        System.out.println("Liderazgo: " + leadership);
    }
}