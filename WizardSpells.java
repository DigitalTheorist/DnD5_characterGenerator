
//README
//Declare an array to hold the spells.
//The array must be declare this as "public static"
// in order for it to be accessible outside the class.


public class WizardSpells {
  // TODO: 6/20/20   // declare and array of objects as: object - spellLevel contains -- spell


  //random number to call a spell from the spellbook.
  // TODO: 6/19/20 make spellRandomizer method run on its own PRIOR
  //  to calling it so it will be a unique number each time??
  public static int spellRandomizer = (int) (Math.random() * 6);

  public static String[] spellBook = {
          "wallOfWater",
          "transform",
          "magicMissle",
          "cantrip",
          "fireArrow",
          "colorize"};
}

