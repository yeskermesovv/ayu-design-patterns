package kz.ayu.strategy;

public class Main {

    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Vasya", new Gun());

        warrior1.attack(); // shooting with gun
        warrior1.setWeapon(new Knife());
        warrior1.attack(); // cutting with knife
    }
}

class Warrior {

    private String name;

    private Weapon weapon;

    public Warrior(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    void attack() {
        weapon.attack();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

interface Weapon {
    void attack();
}

class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("cutting with knife");
    }
}

class Gun implements Weapon {

    @Override
    public void attack() {
        System.out.println("shooting with gun");
    }
}


