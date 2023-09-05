package StructuralPatterns.DecoratorPattern.Classes;

public class NormalMan implements Component{
    public final int health = 100;

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void attack() {
        System.out.println("普通人使用拳头攻击一次。");
    }
}
