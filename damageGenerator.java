import java.util.Random;

public class damageGenerator {
    // TODO: 6/19/20 make dmgRandomizer method run on its own
    //  PRIOR to calling it so it will be a unique number each time.
    //public static damageGenerator wiz = new damageGenerator() {};

    public static int spellDamage() {
        Random spellRand = new Random();
        int dmgDoneBySpell = spellRand.nextInt(30);
        return dmgDoneBySpell;
    }

    public static int weaponDamage() {
        Random weaponRand = new Random();
        int dmgDoneByWeapon = weaponRand.nextInt(55);
        return dmgDoneByWeapon;
    }
}