package gameOOP.events;

import gameOOP.combatants.CharacterC;
import gameOOP.combatants.MainHeroPC;
import gameOOP.combatants.MonsterNPC;
import gameOOP.mechanic.Combat;

import java.util.Map;

public class EventStartGame {
    SpawnHero spawnhero = new SpawnHero();
    SpawnMob spawnmob = new SpawnMob();


    /*
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
        spawnmob.createMultiple(mob1);
        spawnmob.getMobsmap().get("mobs1");
        spawnmob.getMobsmap().get("mobs2");
        spawnmob.getMobsmap().get("mobs3");
        combat.fight(mainhero, (CharacterC) spawnmob.getMobsmap().get("mobs1"));
        Map<String, MonsterNPC> map = spawnmob.getMobsmap();

        for (Map.Entry<String, MonsterNPC> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().toString());
            System.out.println("Current opponent: " + entry.getKey());
            //System.out.println(entry.getValue().toString());
                combat.fight(mainhero, entry.getValue());

        }
    }

}
