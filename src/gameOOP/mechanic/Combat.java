package gameOOP.mechanic;

import gameOOP.combatants.CharacterC;
import gameOOP.events.SpawnMob;
import gameOOP.mechanic.items.Inventory;
import gameOOP.mechanic.items.Sword;

public class Combat {
    SpawnMob mob1;
    Inventory inv = new Inventory();
    Sword sword1 = new Sword("Wooden stick");
    CharacterC c1;
    int i = 1;

    public CharacterC fight(CharacterC c1, CharacterC c2) {
        if (c1.getHealthbar() <= 0) {
            System.out.println("You are too damaged");
            System.exit(0);
            return c1;
        }
        int c1hp = c1.getHealthbar();
        int c1dmg = c1.getDamage();
        int c2hp = c2.getHealthbar();
        int c2dmg = c2.getDamage();
        while (c1hp > 0 && c2hp > 0) {
            c1hp = c1hp - c2dmg;
            System.out.println(c1.getName() + " absorbs " + c2dmg + " damage");
            c2hp = c2hp - c1dmg;
            System.out.println(c2.getName() + " absorbs " + c1dmg + " damage");
            System.out.println();
            System.out.println("Turn " + i);
            i++;
            if (c1hp <= 0) {
                System.out.println(c1.getName() + " passed away");
                System.out.println("GAME OVER");
                System.exit(0);

            } else if (c2hp <= 0) {
                System.out.println(c2.getName() + " passed away!!!");
                //inv.create(sword1);
                inv.addToInventory(sword1, c1);
                c1.getDamage();
            }
        }
        c1.setHealthbar(c1hp);
        System.out.println(c1hp);
        System.out.println("Your HP bar:: " + c1hp);
        //System.out.println(getDropGold);
        return c1;
    }
}
