package gameOOP.events;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;

interface Spawn<T> {

    create(<T> mainhero);

}
