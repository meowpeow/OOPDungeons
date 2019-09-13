package gameOOP.creatures;

public class Person implements Human {


    @Override
    public void changeEnthropy() {
        System.out.println("Enthropy is increasing...");
    }

    @Override
    public void createaLife() {
        System.out.println("Biological weapon is created");

    }
}
