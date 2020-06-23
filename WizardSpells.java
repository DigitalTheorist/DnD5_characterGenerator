
//README
//Declare an array to hold the spells.
//The array must be declare this as "public static"
// in order for it to be accessible outside the class.


import java.util.Random;

public class WizardSpells {
  // TODO: 6/20/20   // declare and array of objects as: object - spellLevel contains -- spell

  //random number to call a spell from the spellbook.
  // TODO: 6/19/20 make spellRandomizer method run on its own PRIOR
  //  to calling it so it will be a unique number each time??
  // function to be called each time to generate a random number.

  public static String GetRandomSpell() {
    Random rand = new Random();
    int bookSize = spellBook.length;
    int selectSpell = rand.nextInt(bookSize);
    return spellBook[selectSpell];
  }

  //public static int spellRandomizer = (int) (Math.random() * 6);

  public static String[] spellBook = {
          "wallOfWater",
          "transform",
          "magicMissle",
          "cantrip",
          "fireArrow",
          "colorize"};
}

