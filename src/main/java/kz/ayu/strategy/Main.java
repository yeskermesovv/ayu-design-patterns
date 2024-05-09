package kz.ayu.strategy;

public class Main {

    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Vasya", new Gun());

        warrior1.attack(); // shooting with gun
        warrior1.setWeapon(new Knife());
        warrior1.attack(); // cutting with knife
    }
}