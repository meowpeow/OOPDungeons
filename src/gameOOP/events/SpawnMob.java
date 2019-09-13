package gameOOP.events;


import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;
import gameOOP.combatants.MonsterNPC;

class SpawnMob implements Spawn {
    @Override
    public MainHeroPC create(MainHeroPC mainhero) {
        return null;
    }
}

/*    @Override
    public Character create(Character mob) {
        return mob;
    }
}*/
