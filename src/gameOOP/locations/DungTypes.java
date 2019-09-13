package gameOOP.locations;

public enum DungTypes {
    BARREN("Barren", 1),
    FROZEN("Frozen", 5),
    DEADLY("Deadly", 10);

    private String name;
    private int difficulty;

    DungTypes(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public static DungTypes[] getDungInfo() {
        return new DungTypes[]{BARREN, FROZEN, DEADLY};
    }

    @Override
    public String toString() {
        return "DungTypes{" +
                "name='" + name + '\'' +
                ", gameOOP.difficulty=" + difficulty +
                '}';
    }
}
