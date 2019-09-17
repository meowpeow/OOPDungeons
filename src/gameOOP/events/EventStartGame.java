package gameOOP.events;

import gameOOP.combatants.MainHeroPC;
import gameOOP.combatants.MonsterNPC;
import gameOOP.mechanic.Combat;

public class EventStartGame {


SpawnHero spawnhero = new SpawnHero();
SpawnMob spawnmob = new SpawnMob();

/*    MainHeroPC mainhero;
    MonsterNPC mob1;
    */
    public void startGame() {

        MainHeroPC mainhero = new MainHeroPC();
        spawnhero.create(mainhero);
        MonsterNPC mob1 = new MonsterNPC();
        spawnmob.create(mob1);

        Combat combat = new Combat();
        combat.fight(mainhero, mob1);
        System.out.println(mainhero.getHealthbar());


    }

}
