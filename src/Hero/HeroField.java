package Hero;

import java.util.Random;

public class HeroField {
    // create instance of Random class
    static Random rand = new Random();

    public static void battleToDeath(Hero Hero1, Hero Hero2) {
        // Generate random integers in range 0 to 999
        int rand_int1 = rand.nextInt(10);
        Hero h1;
        Hero h2;
        if (rand_int1 % 2 == 0) {
            h1 = Hero1;
            h2 = Hero2;
        } else {
            h2 = Hero1;
            h1 = Hero2;
        }

        // Goes on until one Hero reaches 0 or below
        while (h1.getHealth() > 0 && h2.getHealth() > 0) {
            h1.attackHero(h2);
            System.out.println(h2.getName() + ": " + h2.getHealth());
            h2.attackHero(h1);
            System.out.println(h1.getName() + ": " + h1.getHealth());

            if (h1.getHealth() <= 0) {
                System.out.println(h2.getName() + " wins!");
            } else if (h2.getHealth() <= 0) {
                System.out.println(h1.getName() + " wins!");
            }
        }
    }

    public static void main(String[] args) {
        Hero h1 = new Hero("Arbitros", 100, 10, 5);
        Hero h2 = new Hero("Excalios", 100, 10, 5);

        // System.out.println(h2.getHealth());
        battleToDeath(h1, h2);
    }
}

