
//README
//Declare an array to hold spells for wizard object generation.
//The array must be declare this as "public static"
// in order for it to be accessible outside the class.


import java.util.Random;

public class WizardSpells {
  // TODO: 6/20/20   // declare and array of objects as: object - spellLevel, spells, dmgModifier -- spell

  // function to be called each time to generate a random number.
  public static String GetRandomSpell() {
    Random rand = new Random();
    int bookSize = spellBook.length;
    int selectSpell = rand.nextInt(bookSize);
    return spellBook[selectSpell];
  }

  public static String[] spellBook = {
          "wallOfWater",
          "transform",
          "magicMissle",
          "cantrip",
          "fireArrow",
          "colorize"};
}

