package gameOOP.events;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;
import gameOOP.combatants.MonsterNPC;

import java.util.HashMap;
import java.util.Map;

public class SpawnMob implements Spawn<MonsterNPC> {
    private MonsterNPC mob1;
    private Map mobsmap;

    @Override
    public MonsterNPC create(MonsterNPC mob1) {
        mob1.setId(1000);
        mob1.setName("goblin");
        mob1.setLevel(1);
        mob1.setHealthbar(10);
        mob1.setDamage(6);
        return mob1;
    }

    public Map createMultiple(MonsterNPC mobtype) {
        mobsmap = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            String mobkey = String.format("mobs%s", i);
            //MonsterNPC mobs;
            MonsterNPC mobs = null;
            try {
                mobs = mobtype.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            mobsmap.put(mobkey, mobs);

        }
        return mobsmap;
    }

    public MonsterNPC getMob1() {
        return mob1;
    }

    public void setMob1(MonsterNPC mob1) {
        this.mob1 = mob1;
    }

    public Map getMobsmap() {
        return mobsmap;
    }

    public void setMobsmap(Map mobsmap) {
        this.mobsmap = mobsmap;
    }

/*            this.id = mobtype.id;
        this.name = mobtype.name;
        this.level = mobtype.level;
        this.healthbar = mobtype.healthbar;
        this.damage = mobtype.damage;*/

}
/*    @Override
    public Character create(Character mob) {
        return mob;
    }
}*/
