package com.etna;

/**
 * Created by crystal on 22/01/2017.
 */
enum statusAnimal {
    ALIVE, DEAD
}

public abstract class AbstractAnimal {
    protected int _hp;
    protected int _attackForce;
    protected String _name;
    protected statusAnimal _status;

    public statusAnimal get_status() {
        return _status;
    }

    public void set_status(statusAnimal _status) {
        this._status = _status;
    }

    public int get_hp() {
        return _hp;
    }

    public void set_hp(int _hp) {
        this._hp = _hp;
    }

    public int get_attackForce() {
        return _attackForce;
    }

    public void set_attackForce(int _attackForce) {
        this._attackForce = _attackForce;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    protected AbstractAnimal() {
        this.set_name("No Name");
        this.prepareObject();
    }

    protected AbstractAnimal(String name) {
        this.set_name(name);
        this.prepareObject();
    }

    private void prepareObject() {
        this.set_hp((int) (Math.random() * 801.0) + 400);
        this.set_attackForce((int) (Math.random() * 31.0));
        this.set_status(statusAnimal.ALIVE);
    }

    public void receiveDamage(int attackForce) {
        this.set_hp(this.get_hp() - attackForce);
        if (this.get_hp() < 1) {
            this.set_status(statusAnimal.DEAD);
        }
    }

    public abstract void attack(AbstractAnimal otherAnimal);
}