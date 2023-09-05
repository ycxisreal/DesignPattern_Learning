package StructuralPatterns.DecoratorPattern.Classes;

public class DogMan implements Component{
    public final int health = 150;

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void attack() {
        System.out.println("狗人使用嘴巴攻击一次。");
    }
}
