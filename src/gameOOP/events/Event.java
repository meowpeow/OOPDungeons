package gameOOP.events;

import gameOOP.combatants.MainHeroPC;

public interface Event {

    void levelup(MainHeroPC mainhero);

    void curse(MainHeroPC mainhero);

    void blessing(MainHeroPC mainhero);

    void fighting(MainHeroPC mainhero);

}
