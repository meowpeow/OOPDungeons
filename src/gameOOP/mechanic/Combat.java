package gameOOP.mechanic;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;
import gameOOP.combatants.MonsterNPC;
import gameOOP.events.EventStartGame;
import gameOOP.events.SpawnHero;
import gameOOP.events.SpawnMob;

public class Combat {
    SpawnHero mainhero;
    SpawnMob mob1;

    public int fight(Character c1, Character c2) {
        int c1hp = c1.getHealthbar();
        int c1dmg = c1.getDamage();
        int c2hp = c2.getHealthbar();
        int c2dmg = c2.getDamage();
        while (c1hp > 0 && c2hp > 0) {
            c1hp = c1hp - c2dmg;
            c2hp = c2hp - c1dmg;
            int i = 1;
            System.out.println("Turn " + i);
            i++;
            if (c1hp <= 0) {
                System.out.println(c1.getName() + " passed away");
                if (c1.getName().equals(mainhero.getMainhero().getName())) {
                    System.out.println("GAME OVER");
                }

            } else if (c2hp <= 0) {
                System.out.println(c2.getName() + " passed away!!!");
            }
        }
        c1.setHealthbar(c1hp);
        System.out.println(c1hp);
        return c1hp;
    }
}
