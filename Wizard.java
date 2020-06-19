public class Wizard {
    String hat; 
    String wand;
    String spell;
    int intelligence; 
    int wisdom;
    int spellDmg;

    // This constructor holds a method for randomizing and assigning a spell called from the WizardSpells file
        public Wizard() {
             //variable to hold the spell.
            this.spell = WizardSpells.spellBook[WizardSpells.spellRandomizer];
             //variable to hold
            this.spellDmg = damageGenerator.dmgRandomizer;
        }

    // TODO: 6/18/20 why does public Wizard work above but spellDamage does not?
    // TODO: 6/18/20 says "Return type required" of spelldamage - why? 


        void makeWizard() {
            System.out.println("I am born");
            System.out.println("my spellbook holds this spell...");
            System.out.println(spell);
            System.out.println("The damage this spell will do is " + spellDmg);
        }

        void castSpell() {
            System.out.println("I cast " + spell);
            System.out.println("spell complete");
    }
}