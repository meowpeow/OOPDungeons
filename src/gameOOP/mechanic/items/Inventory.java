package gameOOP.mechanic.items;

import gameOOP.combatants.CharacterC;
import gameOOP.combatants.MainHeroPC;

import java.util.List;
import java.util.ArrayList;


public class Inventory extends Items<Sword> {

   // MainHeroPC mainhero = mainhero;
    private Items item;



    Sword sword1 = new Sword();
    List<Items> inventoryList = new ArrayList<>();

    public Items<Items> create(Items item) {

        //if (sword1 == null && item == null && item.getTitle().equals(sword1.getTitle()))
        {
            this.item = sword1.spawnSword();
        }
        return this.item;
    }


    public CharacterC addToInventory(Items item, CharacterC c) {
        inventoryList.add(create(item));

        if (!inventoryList.contains(item)) {
            c.setDamage(c.getDamage() + item.getDmgadd() );

        }
        else {
            System.out.println("FAIL");
        }

        return c;
    }

}
