



public class charGenerator {
    public static void main (String[] args) {

        Wizard gandalf = new Wizard();
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
            gandalf.makeWizard();
            
            System.out.println();
            gandalf.castSpell();

        Wizard merlin = new Wizard();
            merlin.makeWizard();
        

                 
          

            
                //how do i call data from and object outside of the main class?
                //why is it printing the makeWizard call but not the warrior call?
        Warrior groo = new Warrior(); 
            groo.makeWarrior();         
                
    }
}