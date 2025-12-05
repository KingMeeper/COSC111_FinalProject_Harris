import java.util.Random;
public class Pokémon {

    //Statistics for the player and boss
    private String name;
    private int health;
    private int attackMin;
    private int attackMax;
    private int healMin;
    private int healMax;

    //Random system that allows me to generate random numbers for attacking and healing
    Random random = new Random(System.currentTimeMillis());

    //Constructor for the Pokémon and boss
    public Pokémon(String name, int health, int attackMin, int attackMax, int healMin, int healMax){
        this.name = name;
        this.health = health;
        this.attackMin = attackMin;
        this.attackMax = attackMax;
        this.healMin = healMin;
        this.healMax = healMax;
    }

    //Generates a random amount of damage to be applied to either the player or the boss
    public int nextAttack(){
        return random.nextInt(attackMax - attackMin + 1) + attackMin;
    }

    //Applies the amount of damage to either the player or the boss
    public boolean attacked(int attack){
        health -= attack;
        return health <= 0;
    }

    //Gets a random amount of health to be recovered, and add it to the player that chose to recover
    public int heal(){
        int h = random.nextInt(healMax - healMin + 1) + healMin;
        health += h;
        return h;
    }

    //Getter that sets up the printInfo(), which allows players to see the status of the boss and the player.
    public int getHealth(){
        return health;
    }

    //Getter that sets up the printInfo(), which allows players to see the status of the boss and the player
    public String getName(){
        return name;
    }

    //Prints the status about the player and boss before each turn.
    public void printInfo(){
      System.out.println(name + " has " + health + " health");
    }

}
