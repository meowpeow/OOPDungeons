package gameOOP.events;


import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;
import gameOOP.combatants.MonsterNPC;

class SpawnMob implements Spawn<MonsterNPC> {
    @Override
    public MonsterNPC create(MonsterNPC mob) {
        return new mob;
    }
}
/*    @Override
    public Character create(Character mob) {
        return mob;
    }
}*/
