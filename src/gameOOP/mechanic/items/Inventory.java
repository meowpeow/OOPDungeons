package gameOOP.mechanic.items;

import gameOOP.mechanic.items.Items;
import gameOOP.mechanic.items.Sword;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Inventory extends Items<Sword>{
    Sword swordObj = new Sword();                                                                                                                   cxddDdDddddd
    List<Sword> inventoryList = new ArrayList<Sword>();

    List<> create(T item) {
        Items item = swordObj.spawnSword();
        return item;
    }

    void addToInventory(Items item) {
        inventoryList.create();
    }

}
