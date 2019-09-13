package gameOOP.events;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;

public interface Spawn<M extends Character> {

    public <T> T create (T item);
}
