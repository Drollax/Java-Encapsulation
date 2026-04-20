package org.example;

public enum Weapon {
    SWORD(50, 1.2);

    private final int damage;
    private final double attackSpeed;

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }
    Weapon (int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }


}
