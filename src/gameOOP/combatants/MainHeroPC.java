package gameOOP.combatants;


public class MainHeroPC extends Character {

    private int id;
    private String name;
    private int level;
    private int healthbar;
    private int damage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthbar() {
        return healthbar;
    }

    public void setHealthbar(int healthbar) {
        this.healthbar = healthbar;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        return "MainHero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", healthbar=" + healthbar +
                ", damage=" + damage +
                '}';
    }
}



/*
    public MainHeroPC() {
        this.id = getId();
        this.name = getName();
        this.level = 1;
        this.healthbar = 50;
        this.damage = 3;
    }*/

/*    public void setName(String name) {
        CharactersNameRequest cname = new CharactersNameRequest();
        this.name = cname.getMainCharactersName();;
        this.name = name;
    }*/
