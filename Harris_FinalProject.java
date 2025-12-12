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
        System.out.print("Enter 'Boss' Name: ");
        String BossName = kb.next();
        System.out.println("");

        //Name, Health, Minimum Attack Power, Maximum Attack Power, Minimum Recovery, and Maximum Recovery for the player and the boss.
        Pokémon player = new Pokémon(PokémonName, 2000, 100, 400, 100, 1000);
        Pokémon boss = new Pokémon(BossName, 1500, 150, 750, 25, 500);

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
            player.printInfo();
            boss.printInfo();
            choice = readMenuChoice(kb);
            if (choice == 1){
                int attack = player.nextAttack();
                System.out.println("");
                System.out.println(PokémonName + " attacked " + BossName + "." + " It did " + attack + " damage.");
                boolean died = boss.attacked(attack);
                if (died) {
                    bossAlive = false;
                    break;
                }    
            } else if (choice == 2){
                int heal = player.heal();
                System.out.println("");
                System.out.println(PokémonName + " recovered " + heal + " health.");
            } else {
                System.out.println(PokémonName + " chose to forfeit their turn!");
            }

            // boss turn portion
            choice = bossTurn.nextInt(10);
            if (choice <= 7){
                int attack = boss.nextAttack();
                System.out.println(BossName + " attacked " + PokémonName + "." + " It did " + attack + " damage.");
                System.out.println("");
                boolean died = player.attacked(attack);
                if (died) {
                    pokémonAlive = false;
                }    
            } else {
                int heal = boss.heal();
                System.out.println(BossName + " recovered " + heal + " health.");
                System.out.println("");
            } 
        }
        //Messages that appear if you win or lose to the boss
        if (!pokémonAlive){
                System.out.println("");
                System.out.println(PokémonName + " has blacked out!");
                System.out.println("Game Over!");
                System.out.println("");
            }
            if (!bossAlive){
                System.out.println("");
                System.out.println(BossName + " has perished!");
                System.out.println("Congradulations! You Win! :)");
                System.out.println("");
            }
    }
    
}
