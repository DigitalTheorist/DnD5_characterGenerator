//Import Utils ---------------
import java.util.*;
//----------------------------


public class WizardSpells {

   public static String newArcane;

  // TODO: 6/20/20   // declare and array of objects as: object - spellLevel, spells, dmgModifier -- spell

  // function to generate a random number.
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


  // what module (file?) should this method go into?
  public static String inputArcane() {
    Scanner addArcane = new Scanner(System.in);
    System.out.println("Enter a bonus spell into your spell book:");
    String newArcane = addArcane.nextLine();
    return newArcane;
    //Do I always have to return a data type?????
    }

  //ArrayList provides more flexibility than a standard Java list.
   public static String RandomArcane() {
        ArrayList<String> arcaneSpells = new ArrayList<String>();
        arcaneSpells.add("slowTime");
        arcaneSpells.add("iceArmor");
        arcaneSpells.add(newArcane);
        int arcaneSize = arcaneSpells.size();

       Random arcRand = new Random();
       int selectArcane = arcRand.nextInt(arcaneSize);
       return arcaneSpells.get(selectArcane);
   }
}






