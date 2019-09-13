package gameOOP.creatures;

public class Dog implements gameOOP.creatures.Animal {
    @Override
    public void sound() {
        System.out.println("wuf wuf");
    }

    @Override
    public void die() {
        System.out.println("wuuuuuuuuuf");
    }
}
