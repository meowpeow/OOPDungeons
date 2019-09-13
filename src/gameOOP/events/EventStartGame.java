package gameOOP.events;

import gameOOP.combatants.MainHeroPC;

public class EventStartGame {

SpawnHero spawnhero = new SpawnHero();

    public void startGame() {
        MainHeroPC mainhero = new MainHeroPC();
        spawnhero.create(mainhero);

    }

}
