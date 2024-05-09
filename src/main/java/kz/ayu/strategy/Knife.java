package kz.ayu.strategy;

class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("cutting with knife");
    }
}