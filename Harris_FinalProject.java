import java.util.Random;
import java.util.Scanner;

public class Harris_FinalProject {

    //Menu for choosing your turn
    static int readMenuChoice(Scanner kb){
        System.out.println("");
        System.out.println("1. Attack");
        System.out.println("2. Heal");
        return kb.nextInt();
    }

    public static void main(String[] args) {
        //Entering Pokémon name and Boss name
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter 'Pokémon' Name: ");
        String PokémonName = kb.next();
        System.out.print("Enter Boss Name: ");
        String BossName = kb.next();

        //Name, Health, Minimum Attack Power, Maximum Attack Power, Minimum Recovery, and Maximum Recovery for the player and the boss.
        Pokémon boss = new Pokémon(PokémonName, 2500, 50, 250, 10, 100);
        Pokémon player = new Pokémon(BossName, 1500, 25, 500, 25, 500);

        //Menu Choice
        int choice = 0;

        //Confirms that either the player or the boss is alive
        boolean pokémonAlive = true;
        boolean bossAlive = true;

        //Allows the boss to take his turn
        Random bossTurn = new Random(System.currentTimeMillis());
        
        //Keeps the game running as long as either the Pokémon or the Boss is still alive
        while (pokémonAlive && bossAlive){
            // player turn portion
            boss.printInfo();
            player.printInfo();
            choice = readMenuChoice(kb);
            if (choice == 1){
                int attack = player.nextAttack();
                System.out.println(PokémonName + " attacked " + BossName + "." + "It did " + attack + " damage");
                boolean died = boss.attacked(attack);
                if (died) {
                    bossAlive = false;
                }    
            } else if (choice == 2){
                int heal = player.heal();
                System.out.println(PokémonName + " recovered " + heal + " health");
            } else {
                System.out.println(PokémonName + " chose to forfeit their turn!");
            }

            // boss turn portion
            choice = bossTurn.nextInt(10);
            if (choice <= 7){
                int attack = boss.nextAttack();
                System.out.println(BossName + " attacked " + PokémonName + "." + "It did " + attack + " damage");
                boolean died = player.attacked(attack);
                if (died) {
                    pokémonAlive = false;
                }    
            } else {
                int heal = boss.heal();
                System.out.println(BossName + " recovered " + heal + " health");
            } 
        }
        //Messages that appear if you win or lose to the boss
        if (!pokémonAlive){
                System.out.println(PokémonName + " has blacked out!");
                System.out.println("Game Over!");
            }
            if (!bossAlive){
                System.out.println(BossName + " has perished!");
                System.out.println("Congradulations! You Win! :)");
            }
    }
    
}
