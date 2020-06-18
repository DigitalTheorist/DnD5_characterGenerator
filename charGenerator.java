

class wizard {
    String hat; 
    String wand; 
    int intelligence; 
    int wisdom; 

    //Declare an array to hold the spells. 
    String[] spellBook = {"silence", "charmSpell", "magicMissle", "arcaneArmor", "fireBall", "sleepSpell"};

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

class warrior {
    String helm; 
    String weapon; 
    String shield; 
    int strength;
    int dexterity; 
    
    void makeWarrior() {
       // int str = (int) (Math.random() * 19);
        System.out.println("the warrior's strength is generated here?");
    }
}


public class charGenerator {
    public static void main (String[] args) {

        wizard gandalf = new wizard();
            gandalf.hat = "pointed";
            gandalf.wand = "polished";
            //gandalf.spellBook = "ancient";
            gandalf.intelligence = (int) ((Math.random() * 19) +5);
            gandalf.wisdom = (int) (Math.random() * 19);

            System.out.println("My hat is " + gandalf.hat);
            System.out.println("My wand is " + gandalf.wand);
           // System.out.println("My spellbook is " + gandalf.spellBook);
           // System.out.println("My spell is " + spell);
            System.out.println("My intelligence is " + gandalf.intelligence);
            System.out.println("My wisdom is " + gandalf.wisdom);
                //what methods can you put in classes? 
            gandalf. makeWizard();
                 
          

            System.out.println();
            gandalf.castSpell();
                //how do i call data from and object outside of the main class?
                //why is it printing the makeWizard call but not the warrior call?
        warrior groo = new warrior(); 
            groo.makeWarrior();         
                
    }
}