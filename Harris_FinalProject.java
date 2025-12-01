import java.util.Scanner;

public class Harris_FinalProject {

    static void printMenu(){
            System.out.println("");
            System.out.println("1. Attack");
            System.out.println("2. Heal");

        }
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter 'Pokémon' Name: ");
        String PokémonName = kb.next();
        System.out.print("Enter Boss Name: ");
        String BossName = kb.next();

        Pokémon boss = new Pokémon(100, 10);
        Pokémon player = new Pokémon(50, 30);

        int choice = 0;

        while (PokémonHealth > 0 && BossHealth > 0){
            do {
            printMenu();
            choice = readMenuChoice(kb);
            if (choice == 1){

            } else if (choice == 2){

            } else {
                System.out.println(PokémonName + " chose to forfeit their turn!");
            }
        }
        }
        if (PokémonHealth <= 0){
                System.out.println(PokémonName + " has blacked out!");
                System.out.println("Game Over!");
            }
            if (BossHealth <= 0){
                System.out.println(BossName + " has perished!");
                System.out.println("Congragulations! You Win!");
            }
    }
    
}
