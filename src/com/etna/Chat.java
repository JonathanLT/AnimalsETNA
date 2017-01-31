package com.etna;

/**
 * Created by crystal on 22/01/2017.
 */
public class Chat extends AbstractAnimal {
    public Chat() {
    }

    public Chat(String name) {
        super(name);
    }

    @Override
    public void attack(AbstractAnimal otherAnimal) {
        if ((int) (Math.random() * 2.0) == 2) {
            otherAnimal.receiveDamage(this.calinChatPotte());
        } else {
            otherAnimal.receiveDamage(this.get_attackForce());
        }
    }

    @Override
    public String get_name() {
        return ("Le Furet : " + super.get_name());
    }

    private int calinChatPotte() {
        return ((int) (Math.random() * 20) + 30);
    }
}