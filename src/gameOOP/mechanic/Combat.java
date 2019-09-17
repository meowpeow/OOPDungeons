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
<<<<<<< Updated upstream

=======
    int i = 1;
>>>>>>> Stashed changes
    public int fight(Character c1, Character c2) {
        int c1hp = c1.getHealthbar();
        int c1dmg = c1.getDamage();
        int c2hp = c2.getHealthbar();
        int c2dmg = c2.getDamage();
        while (c1hp > 0 && c2hp > 0) {
            c1hp = c1hp - c2dmg;
            System.out.println(c1.getName() + " inflicts " + c2dmg + " damage");
            c2hp = c2hp - c1dmg;
<<<<<<< Updated upstream
            int i = 1;
=======
            System.out.println(c2.getName() + " inflicts " + c1dmg + " damage");
            System.out.println();
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        System.out.println(c1hp);
=======
        System.out.println("Your HP bar:: " + c1hp);
>>>>>>> Stashed changes
        return c1hp;
    }
}
