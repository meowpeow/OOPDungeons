package gameOOP.creatures;

public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void die() {
        System.out.println("MEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEOOOOOOOOOOOOOOWWWWWWWWWWWWWWWWW");
    }
}
