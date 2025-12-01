/*
 * Potion Lab: Brewing Up Java Objects
 * -------------------------------------
 *
 * Complete the TODOs below to:
 * 1. Define a Potion class
 * 2. Give it attributes and methods
 * 3. Create Potion objects and test them in main()
 *
 * Save both this file and your Potion.java file before submitting.
 */
public class Harris_PotionLab {
    public static void main(String[] args) {
        // TODO 1: Create three Potion objects below.
        // Example:
        Harris_Potion healing = new Harris_Potion("Healing Hennessy", "red", 2);
        Harris_Potion lucky = new Harris_Potion("Lucky Lemonade", "green", 6);
        Harris_Potion invisibility = new Harris_Potion("Vanishing Vodka", "clear", 8);
        Harris_Potion flight = new Harris_Potion("Flying Fanta", "orange", 5);
        Harris_Potion strength = new Harris_Potion("Strong Soda", "brown", 1);
        Harris_Potion speed = new Harris_Potion("Speedy Smoothie", "blue", 7);

        
        

        // TODO 2: Call each potion's describe() method to print out their details.
        System.out.println("");
        healing.describe();
        lucky.describe();
        invisibility.describe();
        flight.describe();
        strength.describe();
        speed.describe();
        



        
        // TODO 3: Stir one or more potions to increase their potency.
        System.out.println("");
        healing.stir();
        healing.stir();
        lucky.stir();
        flight.stir();
        flight.stir();
        strength.stir();


        
        // TODO 4: (Optional) Call brewSpell() to see if any potion is powerful enough!
        System.out.println("");
        healing.brewSpell();
        lucky.brewSpell();
        invisibility.brewSpell();
        flight.brewSpell();
        strength.brewSpell();
        speed.brewSpell();


    }
}
