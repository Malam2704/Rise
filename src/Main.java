// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import Hero.*;
import Player.*;
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("Arbitros", 100, 10, 5);
        Hero h2 = new Hero("Excalios", 100, 10, 5);
        Player me = new Player("Hosticidal");
        me.addHero(h1);
        me.addHero(h2);
        // System.out.println(h2.getHealth());
        HeroField.battleToDeath(h1, h2);
    }
}