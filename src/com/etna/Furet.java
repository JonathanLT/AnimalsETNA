package com.etna;

/**
 * Created by crystal on 22/01/2017.
 */
public class Furet extends AbstractAnimal {
    public Furet() {
    }

    public Furet(String name) {
        super(name);
    }

    @Override
    public void attack(AbstractAnimal otherAnimal) {
        if ((int) (Math.random() * 1.0) == 0) {
            otherAnimal.receiveDamage(this.boulePuante());
        } else {
            otherAnimal.receiveDamage(this.get_attackForce());
        }
    }

    @Override
    public String get_name() {
        return ("Le Furet : " + super.get_name());
    }

    private int boulePuante() {
        return ((int) (Math.random() * 50.0) + 30);
    }
}