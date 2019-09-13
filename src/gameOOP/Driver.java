package gameOOP;

import gameOOP.combatants.MainHeroPC;
import gameOOP.events.EventStartGame;
import gameOOP.events.SpawnHero;

public class Driver {
    public static void main(String[] args) {

        EventStartGame e1 = new EventStartGame();

        e1.startGame();

    }
}
