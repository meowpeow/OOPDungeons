package gameOOP.mechanic.items;

import java.util.ArrayList;
import java.util.List;

public abstract class Items<T> {
    private int cost;
    private int hpadd;
    private int dmgadd;
    private int armoradd;
    private int attackspeedadd;

    List<T> inventoryList = new ArrayList<T>();

}
