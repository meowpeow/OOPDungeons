package gameOOP.combatants;

public class MonsterNPC extends Character {
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

    public MonsterNPC(){}

    public MonsterNPC(MonsterNPC mobtype) {
        this.id = mobtype.id;
        this.name = mobtype.name;
        this.level = mobtype.level;
        this.healthbar = mobtype.healthbar;
        this.damage = mobtype.damage;
    }
    public MonsterNPC clone() throws CloneNotSupportedException {
        return new MonsterNPC(this);
    }
}