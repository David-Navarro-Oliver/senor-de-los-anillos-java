package lotr.app;

import lotr.model.LotrCharacter;
import lotr.races.*;

public class Main {

    public static void main(String[] args) {

        Elf legolas = new Elf();
        legolas.setName("Legolas");
        legolas.setAge(2931);
        legolas.setWeapon("Arco");
        legolas.setRealm("Bosque Negro");
        legolas.setFaction("Comunidad del Anillo");
        legolas.setPowerLevel(95);
        legolas.setSpecialItem("Arco élfico");
        legolas.setAlive(true);
        legolas.setVisionRange(300);

        Elf elrond = new Elf();
        elrond.setName("Elrond");
        elrond.setAge(6000);
        elrond.setWeapon("Espada");
        elrond.setRealm("Rivendel");
        elrond.setFaction("Elfos");
        elrond.setPowerLevel(98);
        elrond.setSpecialItem("Sabiduría ancestral");
        elrond.setAlive(true);
        elrond.setVisionRange(250);

        Elf galadriel = new Elf();
        galadriel.setName("Galadriel");
        galadriel.setAge(7000);
        galadriel.setWeapon("Magia");
        galadriel.setRealm("Lothlórien");
        galadriel.setFaction("Elfos");
        galadriel.setPowerLevel(99);
        galadriel.setSpecialItem("Espejo de Galadriel");
        galadriel.setAlive(true);
        galadriel.setVisionRange(280);


        Human aragorn = new Human();
        aragorn.setName("Aragorn");
        aragorn.setAge(87);
        aragorn.setWeapon("Espada");
        aragorn.setRealm("Gondor");
        aragorn.setFaction("Comunidad del Anillo");
        aragorn.setPowerLevel(97);
        aragorn.setSpecialItem("Andúril");
        aragorn.setAlive(true);
        aragorn.setLeadership(100);

        Human boromir = new Human();
        boromir.setName("Boromir");
        boromir.setAge(41);
        boromir.setWeapon("Espada");
        boromir.setRealm("Gondor");
        boromir.setFaction("Gondor");
        boromir.setPowerLevel(85);
        boromir.setSpecialItem("Cuerno de Gondor");
        boromir.setAlive(false);
        boromir.setLeadership(80);

        Human eowyn = new Human();
        eowyn.setName("Éowyn");
        eowyn.setAge(24);
        eowyn.setWeapon("Espada");
        eowyn.setRealm("Rohan");
        eowyn.setFaction("Rohan");
        eowyn.setPowerLevel(88);
        eowyn.setSpecialItem("Valentía");
        eowyn.setAlive(true);
        eowyn.setLeadership(75);


        Orc azog = new Orc();
        azog.setName("Azog");
        azog.setAge(150);
        azog.setWeapon("Maza");
        azog.setRealm("Moria");
        azog.setFaction("Orcos");
        azog.setPowerLevel(90);
        azog.setSpecialItem("Fuerza bruta");
        azog.setAlive(true);
        azog.setSunlightWeakness(true);

        Orc gothmog = new Orc();
        gothmog.setName("Gothmog");
        gothmog.setAge(140);
        gothmog.setWeapon("Espada");
        gothmog.setRealm("Mordor");
        gothmog.setFaction("Orcos");
        gothmog.setPowerLevel(85);
        gothmog.setSpecialItem("Crueldad");
        gothmog.setAlive(true);
        gothmog.setSunlightWeakness(true);

        Orc lurtz = new Orc();
        lurtz.setName("Lurtz");
        lurtz.setAge(50);
        lurtz.setWeapon("Arco");
        lurtz.setRealm("Isengard");
        lurtz.setFaction("Uruk-hai");
        lurtz.setPowerLevel(88);
        lurtz.setSpecialItem("Fuerza Uruk");
        lurtz.setAlive(false);
        lurtz.setSunlightWeakness(false);


        Hobbit frodo = new Hobbit();
        frodo.setName("Frodo");
        frodo.setAge(50);
        frodo.setWeapon("Daga");
        frodo.setRealm("La Comarca");
        frodo.setFaction("Comunidad del Anillo");
        frodo.setPowerLevel(70);
        frodo.setSpecialItem("El Anillo Único");
        frodo.setAlive(true);
        frodo.setStealth(95);

        Hobbit sam = new Hobbit();
        sam.setName("Sam");
        sam.setAge(38);
        sam.setWeapon("Daga");
        sam.setRealm("La Comarca");
        sam.setFaction("Comunidad del Anillo");
        sam.setPowerLevel(75);
        sam.setSpecialItem("Lealtad");
        sam.setAlive(true);
        sam.setStealth(85);

        Hobbit merry = new Hobbit();
        merry.setName("Merry");
        merry.setAge(36);
        merry.setWeapon("Espada");
        merry.setRealm("La Comarca");
        merry.setFaction("Comunidad del Anillo");
        merry.setPowerLevel(72);
        merry.setSpecialItem("Valentía");
        merry.setAlive(true);
        merry.setStealth(80);


        Dwarf gimli = new Dwarf();
        gimli.setName("Gimli");
        gimli.setAge(139);
        gimli.setWeapon("Hacha");
        gimli.setRealm("Montañas Nubladas");
        gimli.setFaction("Comunidad del Anillo");
        gimli.setPowerLevel(92);
        gimli.setSpecialItem("Hacha doble");
        gimli.setAlive(true);
        gimli.setEndurance(95);

        Dwarf thorin = new Dwarf();
        thorin.setName("Thorin");
        thorin.setAge(195);
        thorin.setWeapon("Espada");
        thorin.setRealm("Erebor");
        thorin.setFaction("Enanos");
        thorin.setPowerLevel(94);
        thorin.setSpecialItem("Escudo de roble");
        thorin.setAlive(false);
        thorin.setEndurance(98);

        Dwarf balin = new Dwarf();
        balin.setName("Balin");
        balin.setAge(178);
        balin.setWeapon("Hacha");
        balin.setRealm("Moria");
        balin.setFaction("Enanos");
        balin.setPowerLevel(85);
        balin.setSpecialItem("Sabiduría");
        balin.setAlive(false);
        balin.setEndurance(90);


        LotrCharacter[] characters = {
                legolas, elrond, galadriel,
                aragorn, boromir, eowyn,
                azog, gothmog, lurtz,
                frodo, sam, merry,
                gimli, thorin, balin
        };

        System.out.println("===== PERSONAJES DEL SEÑOR DE LOS ANILLOS =====");

        for (LotrCharacter character : characters) {
            System.out.println("---------------------------------------------");
            character.printDetails();
        }
    }
}