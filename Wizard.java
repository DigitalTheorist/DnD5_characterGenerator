public class Wizard {
    String hat; 
    String wand;
    String spell;
    int intelligence; 
    int wisdom;
    int spellDmg;

    // This constructor holds a method for randomizing and assigning a spell called from the WizardSpells file
    void randomizeDmg() {

    }

    // TODO: 6/20/20 what is the difference between public Wizard and void makeWizard?? In that they
    // TODO: 6/20/20 are both running code but how are they acting differently?? 
    public Wizard() {
             /*//variable to hold the spell.
            this.spell = WizardSpells.spellBook[WizardSpells.spellRandomizer];
             //variable to hold
            this.spellDmg = damageGenerator.wizDmg;*/
        }

        void makeWizard() {
            System.out.println("I am born");
            System.out.println("my spellbook holds this spell...");

            //variable to hold the spell.
            this.spell = WizardSpells.spellBook[WizardSpells.spellRandomizer];
            System.out.println(spell);

            //variable to hold
            this.spellDmg = damageGenerator.wizDmg;
            System.out.println("The damage this spell will do is " + spellDmg);
        }

        void castSpell() {
            System.out.println("I shall cast " + spell);
           // System.out.println("spell complete");
    }
}