package com.company;


public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1800);
        boss.setDamage(50);
        boss.setDefense("Physical");
        System.out.println("Boss health: " + boss.getHealth() +
                ";\nBoss damage: " + boss.getDamage() +
                ";\nBoss defense type: " + boss.getDefense() + "!");
        for(Hero emp : createHeroes()) {
            System.out.println(emp);
        }

    }

    public static Hero[] createHeroes() {
        Hero Mage = new Hero(250, 30, "Magical");
        Hero Tank = new Hero(300, 20, "Physical");
        Hero Esper = new Hero(225, 25, "Kinetic");

        return new Hero[] {Mage, Tank, Esper};
    }
}