package gameOOP.events;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;
import gameOOP.combatants.MonsterNPC;

import java.util.HashMap;
import java.util.Map;

public class SpawnMob implements Spawn<MonsterNPC> {
    private MonsterNPC mob1;

    @Override
    public MonsterNPC create(MonsterNPC mob1) {
        mob1.setId(1000);
        mob1.setLevel(1);
        mob1.setHealthbar(10);
        mob1.setDamage(6);
        return mob1;
    }

    public MonsterNPC createMultiple (HashMap hm) {
        Map<String, MonsterNPC > mobmap = new HashMap <String, MonsterNPC>();

        for (int i = 0; i<10; i++) {

        }
        return mob1;
    }

    public MonsterNPC getMob1() {
        return mob1;
    }

    public void setMob1(MonsterNPC mob1) {
        this.mob1 = mob1;
    }
}
/*    @Override
    public Character create(Character mob) {
        return mob;
    }
}*/
