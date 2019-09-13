package gameOOP.events;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;
import gameOOP.requests.RequestsForInput;

class SpawnHero implements Spawn {


    public <MainHeroPC> create(MainHeroPC mainhero) {
        RequestsForInput cname = new RequestsForInput();
        mainhero.setName(cname.getMainCharName());
        mainhero.setId(1000);
        mainhero.setLevel(1);
        mainhero.setHealthbar(10);
        System.out.printf(mainhero.getName());
        System.out.println(toString());
        return mainhero;

    }


}
// I WOULD LIKE TO SEE
// MainHero mainHero = new MainHero(123,"billy",2,33,1);
