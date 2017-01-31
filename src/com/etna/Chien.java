package com.etna;

/**
 * Created by crystal on 22/01/2017.
 */
public class Chien extends AbstractAnimal {
    public Chien() {
    }

    public Chien(String name) {
        super(name);
    }

    @Override
    public void attack(AbstractAnimal otherAnimal) {
        if ((int) (Math.random() * 3.0) == 1) {
            otherAnimal.receiveDamage(this.scoobidou());
        } else {
            otherAnimal.receiveDamage(this.get_attackForce());
        }
    }

    @Override
    public String get_name() {
        return ("Le chien : " + super.get_name());
    }

    private int scoobidou() {
        return (20 + (int) (Math.random() * 40.0));
    }
}