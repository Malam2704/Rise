import java.util.Random;

public class PlayerField {
    // create instance of Random class
    static Random rand = new Random();

    public static void battleToDeath(Player player1, Player player2) {
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(10);
        Player p1;
        Player p2;
        if (rand_int1 % 2 == 0) {
            p1 = player1;
            p2 = player2;
        } else {
            p2 = player1;
            p1 = player2;
        }

        // Goes on until one player reaches 0 or below
        while (p1.getHealth() > 0 && p2.getHealth() > 0) {
            p1.attackPlayer(p2);
            System.out.println(p2.getName() + ": " + p2.getHealth());
            p2.attackPlayer(p1);
            System.out.println(p1.getName() + ": " + p1.getHealth());

            if (p1.getHealth() <= 0) {
                System.out.println(p2.getName() + " wins!");
            } else if (p2.getHealth() <= 0) {
                System.out.println(p1.getName() + " wins!");
            }
        }
    }

    public static void main(String[] args) {
        Player p1 = new Player("Arbitros", 100, 10, 5);
        Player p2 = new Player("Excalios", 100, 10, 5);

        // System.out.println(p2.getHealth());
        battleToDeath(p1, p2);
    }
}
