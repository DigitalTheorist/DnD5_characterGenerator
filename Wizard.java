class Wizard {
    String hat; 
    String wand; 
    int intelligence; 
    int wisdom; 

    //Declare an array to hold the spells. 
    String[] spellBook = {
            "silence", 
            "charmSpell", 
            "magicMissle", 
            "arcaneArmor", 
            "fireBall", 
            "sleepSpell"};

    //spellbook array...where do I put it to be most effective?
    //--------------------------------------------------------
    //random number to call a spell from the spellbook
    int spellRandomizer = (int) (Math.random() * 6);
    //variable to hold the spell.
    String spell = spellBook[spellRandomizer];
    
    void makeWizard() {

        System.out.println("I am born");
        System.out.println("my spellbook holds this spell...");
        System.out.println(spell);
    }
    void castSpell() {
        System.out.println("I cast " + spell);
        System.out.println("spell complete");
    }
}