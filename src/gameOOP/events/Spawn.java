package gameOOP.events;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;

interface Spawn<T> {

    T create(T item);


}
