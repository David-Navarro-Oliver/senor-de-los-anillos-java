package lotr.races;

import lotr.model.LotrCharacter;

public class Hobbit extends LotrCharacter {

    private int stealth;

    public Hobbit() {
        super();
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Raza: Hobbit");
        System.out.println("Nivel de sigilo: " + stealth);
    }
}