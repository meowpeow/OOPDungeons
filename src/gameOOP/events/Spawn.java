package gameOOP.events;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;

interface Spawn {

    MainHeroPC create(MainHeroPC mainhero);

}
