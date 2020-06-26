import java.util.ArrayList;

public class Wizard {

    // properties (variables that will be used for each instance of this class ie.
    // for each wizard.

    String hat; 
    String wand;
    String spell;
    String arcane;
    int intelligence; 
    int wisdom;
    int spellDmg;

    // TODO: 6/20/20 what is the difference between public Wizard and void makeWizard?
    //  In that they are both running code but how are they acting differently??
            // --- Answer: one is a constructor and one is a method.
            // --- review how they are scoped.

    // constructor (method that gets called when you create the object). Build the Wizard here..
    public Wizard() {
             //gets a spell from the spell book.
            this.spell = WizardSpells.GetRandomSpell();
             //gets spell damage from damageGenerator.
            this.spellDmg = damageGenerator.spellDamage();
            //gets a spell from the arcane spell book (ArrayList).
            WizardSpells.inputArcane();
            this.arcane = WizardSpells.RandomArcane();
        System.out.println("I am born");
        printStatus();
        String printSpellDmg = "The damage this spell will do is " + spellDmg;
        System.out.println(printSpellDmg);
        }

    // methods! (a function that exists inside of a class). Methods manipulate the object..
    // void makeWizard() {}
    public void printStatus() {
        System.out.println("my spellbook holds this spell...");
        System.out.println(spell);
        System.out.println(arcane);
    }

    public void castSpell() {
            System.out.println("I shall cast " + spell);
        }
}