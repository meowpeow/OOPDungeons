package gameOOP.events;

import gameOOP.combatants.Character;
import gameOOP.combatants.MainHeroPC;
import gameOOP.requests.RequestsForInput;

public class SpawnHero implements Spawn<MainHeroPC> {
    private MainHeroPC mainhero;

    @Override
    public MainHeroPC create(MainHeroPC mainhero) {
        RequestsForInput cname = new RequestsForInput();
        mainhero.setName(cname.getMainCharName());
        mainhero.setId(1000);
        mainhero.setLevel(1);
        mainhero.setHealthbar(100);
        mainhero.setDamage(5);
        System.out.printf(mainhero.getName());
        System.out.println(mainhero.toString());
        return mainhero;

    }

    public MainHeroPC getMainhero() {
        return mainhero;
    }

    public void setMainhero(MainHeroPC mainhero) {
        this.mainhero = mainhero;
    }

}
// I WOULD LIKE TO SEE
// MainHero mainHero = new MainHero(123,"billy",2,33,1);

