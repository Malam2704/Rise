package Player;

import java.util.HashMap;
import Hero.*;
public class Player {
    private String Username;
    private HashMap<String, Hero> heros;

    public Player(String name){
        this.Username = name;
        this.heros = new HashMap<String, Hero>();
    }

    public void addHero(Hero hero){
        heros.put(hero.getName(), hero);
    }
}
