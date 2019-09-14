package gameOOP.mechanic;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;
import gameOOP.combatants.MonsterNPC;
import gameOOP.events.EventStartGame;
import gameOOP.events.SpawnHero;
import gameOOP.events.SpawnMob;

public class Combat {
    public int fight(Character c1, Character c2) {
        int c1hp = c1.getHealthbar();
        int c1dmg = c1.getDamage();
        int c2hp = c2.getHealthbar();
        int c2dmg = c2.getDamage();

        while (c1hp > 0 && c2hp > 0) {

            c1hp = c1hp - c2dmg;

            c2hp = c2hp - c1dmg;
            System.out.println("BATTLE DONE ");
        }
        return c1hp;


    }

}
