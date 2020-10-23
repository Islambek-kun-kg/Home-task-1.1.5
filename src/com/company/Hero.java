package com.company;

public class Hero {
    private int health;
    private int damage;
    private String skill;


    public Hero(int health, int damage, String skill) {
        this.health = health;
        this.damage = damage;
        this.skill = skill;

    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSkill() {
        return skill;
    }

    public String toString() {
        return "Hero - Health=" + health
                + ", Damage=" + damage
                + ", Skill=" + skill + "";
    }
}
