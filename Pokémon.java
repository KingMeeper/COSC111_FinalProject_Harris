import java.util.Random;
public class Pokémon {

    int health;

    int attackMin = 25;
    int attackMax = 100;
    int healMin = 10;
    int healMax = 300;

    Random random = new Random(System.currentTimeMillis());

    public Pokémon(int attackMin, int attackMax, int healMin, int healMax){
        this.attackMin = attackMin;
        this.attackMax = attackMax;
        this.healMin = healMin;
        this.healMax = healMax;
    }

    public int nextAttack(){
        return random.nextInt(attackMax - attackMin + 1) + attackMin;
    }

    public boolean attacked(int attack){
        health -= attack;
        return health <= 0;
    }

    public void heal(){
        health += random.nextInt(healMax - healMin + 1) + healMin;
    }

    



}
