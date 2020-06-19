public class Wizard {
    String hat; 
    String wand;
    String spell;
    String spellDmg;
    int intelligence; 
    int wisdom;

    // This constructor holds a method for randomizing and assigning a spell called from the WizardSpells file
        public Wizard() {
            //random number to call a spell from the spellbook
            int spellRandomizer = (int) (Math.random() * 6);
             //variable to hold the spell.
            this.spell = WizardSpells.spellBook[spellRandomizer];
        }

    // TODO: 6/18/20 why does public Wizard work above but spellDamage does not?
    // TODO: 6/18/20 says "Return type required" of spelldamage - why? 
        public spellDamage() {
            int dmgRandomizer = (int) (Math.random() * 30);
            String dmgRandStringed = Integer.toString(dmgRandomizer);
            // TODO: 6/18/20 throws error: "incompatible types: int cannot be converted to String
            //  this.spellDmg = dmgRandomizer;"
            this.spellDmg = dmgRandomizer;
            System.out.println(dmgRandomizer);
        }

    void makeWizard() {
            System.out.println("I am born");
            System.out.println("my spellbook holds this spell...");
            System.out.println(spell);
            System.out.println("The damage this spell with do is " + spellDmg);
    }
    void castSpell() {
            System.out.println("I cast " + spell);
            System.out.println("spell complete");
    }
}