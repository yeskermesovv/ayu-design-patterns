package kz.ayu.strategy;

class Gun implements Weapon {

    @Override
    public void attack() {
        System.out.println("shooting with gun");
    }
}
