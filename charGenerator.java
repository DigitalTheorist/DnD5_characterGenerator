//This generator holds the main class to generate the characters ~
public class charGenerator {
    public static void main (String[] args) {

        Wizard gandalf = new Wizard();
           /* gandalf.hat = "pointed";
            gandalf.wand = "polished";
            //gandalf.spellBook = "ancient";
            gandalf.intelligence = (int) ((Math.random() * 19) +5);
            gandalf.wisdom = (int) (Math.random() * 19);*/

            //Wizard class output to command line

            /*System.out.println("My hat is " + gandalf.hat);
            System.out.println("My wand is " + gandalf.wand);
            System.out.println("My intelligence is " + gandalf.intelligence);
            System.out.println("My wisdom is " + gandalf.wisdom);*/

            //Call the methods in Wizard;
            System.out.println("I am Gandalf!!!!");
            gandalf.makeWizard();
            gandalf.castSpell();

            Wizard merlin = new Wizard();
            System.out.println("I am Merlin!!!!");
            merlin.makeWizard();
            mer lin.castSpell();
            xxx



        //how do i call data from and object outside of the main class?
        //why is it printing the makeWizard call but not the warrior call?
        Warrior groo = new Warrior();
        groo.makeWarrior();





    }
}