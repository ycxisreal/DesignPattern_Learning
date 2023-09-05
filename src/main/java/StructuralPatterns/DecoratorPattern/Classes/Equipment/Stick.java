package StructuralPatterns.DecoratorPattern.Classes.Equipment;

import StructuralPatterns.DecoratorPattern.Classes.Component;

public class Stick extends Equipment{
    public Stick() {
        this.addHealth = 10;
    }

    @Override
    public int getHealth() {
        return this.addHealth+ man.getHealth();
    }

    @Override
    public void attack() {
        this.man.attack();
        System.out.println("使用木棍攻击一次,并添加10血量。");
    }
}
