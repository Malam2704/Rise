public class Player {
    private String name;
    private int health;
    private int attack;
    private int defense;

    Player(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        if (damage > this.defense) {
            this.health -= (damage - this.defense);
        }
    }

    public void attackPlayer(Player currPlayer) {
        currPlayer.takeDamage(this.attack);
    }

    public static void main(String[] args) {

    }
}