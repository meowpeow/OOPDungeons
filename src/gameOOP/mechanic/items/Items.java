package gameOOP.mechanic.items;

import java.util.ArrayList;
import java.util.List;

public abstract class Items<T> {
    private int id;
    private int cost;
    private String title;
    private int hpadd;
    private int dmgadd;
    private int armoradd;
    private int attackspeedadd;
    private String description;
    List<T> inventoryList = new ArrayList<T>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHpadd() {
        return hpadd;
    }

    public void setHpadd(int hpadd) {
        this.hpadd = hpadd;
    }

    public int getDmgadd() {
        return dmgadd;
    }

    public void setDmgadd(int dmgadd) {
        this.dmgadd = dmgadd;
    }

    public int getArmoradd() {
        return armoradd;
    }

    public void setArmoradd(int armoradd) {
        this.armoradd = armoradd;
    }

    public int getAttackspeedadd() {
        return attackspeedadd;
    }

    public void setAttackspeedadd(int attackspeedadd) {
        this.attackspeedadd = attackspeedadd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
