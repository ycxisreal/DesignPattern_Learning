package StructuralPatterns.DecoratorPattern.Classes.Equipment;

public class Sword extends Equipment{
    public Sword() {
        this.addHealth = 15;
    }
    @Override
    public int getHealth() {
        return this.addHealth+ man.getHealth();
    }
    @Override
    public void attack() {
        this.man.attack();
        System.out.println("使用宝剑攻击一次。并添加15血量");
    }
}
