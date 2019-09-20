package gameOOP.combatants;

public abstract class CharacterC {

    private int id = 0;
    private String name = null;
    private int level = 0;
    private int healthbar = 10;
    private int damage = 2;

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
}
