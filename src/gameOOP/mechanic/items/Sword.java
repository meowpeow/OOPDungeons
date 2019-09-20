package gameOOP.mechanic.items;

import javax.persistence.*;

@Entity
@Table(name = "swords")
public class Sword extends Items {
    public Sword() {
        dmgadd = 0;
    }

    public Sword(String title) {
        if (title.equals("Wooden stick")) {
            dmgadd = 1;
        }
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "cost")
    private int cost;
    @Column(name = "hpadd")
    private int hpadd;
    @Column(name = "dmgadd")
    private int dmgadd;
    @Column(name = "armoradd")
    private int armoradd;
    @Column(name = "attackspeedadd")
    private int attackspeedadd;
    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public int getHpadd() {
        return hpadd;
    }

    @Override
    public void setHpadd(int hpadd) {
        this.hpadd = hpadd;
    }

    @Override
    public int getDmgadd() {
        return dmgadd;
    }

    @Override
    public void setDmgadd(int dmgadd) {
        this.dmgadd = dmgadd;
    }

    @Override
    public int getArmoradd() {
        return armoradd;
    }

    @Override
    public void setArmoradd(int armoradd) {
        this.armoradd = armoradd;
    }

    @Override
    public int getAttackspeedadd() {
        return attackspeedadd;
    }

    @Override
    public void setAttackspeedadd(int attackspeedadd) {
        this.attackspeedadd = attackspeedadd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private Sword sword1;

    public Sword getSword1() {
        return sword1;
    }

    public void setSword1(Sword sword1) {
        this.sword1 = sword1;
    }

    public Sword spawnSword() {
        Sword sword1 = new Sword();
        sword1.setTitle("Wooden stick");
        sword1.setCost(1);
        sword1.setDmgadd(1);
        //sword1() {}
            /*sword1.title = "Wooden stick";
        sword1.cost = 1;
        sword1.hpadd = 0;
        sword1.dmgadd = 1221;*/
        return sword1;
    }
    /*
    LinkedList<T> inventoryList;

    inventoryList.add

*/

}
