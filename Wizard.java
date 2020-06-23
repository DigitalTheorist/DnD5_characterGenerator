public class Wizard {
    String hat; 
    String wand;
    String spell;
    int intelligence; 
    int wisdom;
    int spellDmg;

    // This constructor holds a method for randomizing and
    // assigning a spell called from the WizardSpells file.
    void randomizeDmg() {
        //variable to hold damage that the spell will do
        this.spellDmg = damageGenerator.wizDmg;
    }

    // TODO: 6/20/20 what is the difference between public Wizard and void makeWizard?? In that they
    // TODO: 6/20/20 are both running code but how are they acting differently?? 
    // constructor (method that gets called when you create the object). Build the Wizard here..
    public Wizard() {
             //variable to hold the spell.
            this.spell = WizardSpells.GetRandomSpell();
             //variable to hold
            this.spellDmg = damageGenerator.wizDmg;
        System.out.println("I am born");
        System.out.println("my spellbook holds this spell...");
        //variable to hold the spell.
        //spell = WizardSpells.spellBook[WizardSpells.spellRandomizer];
        System.out.println(spell);
        //Damage generator.
        randomizeDmg();
        System.out.println("The damage this spell will do is " + spellDmg);
        }

        // methods! (a function that exists inside of a class). Methods manipulate the object..
        // void makeWizard() {}

        void castSpell() {
            System.out.println("I shall cast " + spell);
            System.out.println(" ");

            // System.out.println("spell complete");
        }
}