package gameOOP.mechanic.items;

public class Sword extends Items {
    private int cost;
    private int hpadd;
    private int dmgadd;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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

    public Sword spawnSword() {
        Sword sword1 = new Sword();
        sword1.cost = 1;
        sword1.hpadd = 0;
        sword1.dmgadd = 1;
        return sword1;
    }
    /*
    LinkedList<T> inventoryList;

    inventoryList.add

*/

}
