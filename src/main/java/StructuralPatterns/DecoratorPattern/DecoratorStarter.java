package StructuralPatterns.DecoratorPattern;

import StructuralPatterns.DecoratorPattern.Classes.Component;
import StructuralPatterns.DecoratorPattern.Classes.DogMan;
import StructuralPatterns.DecoratorPattern.Classes.Equipment.Equipment;
import StructuralPatterns.DecoratorPattern.Classes.Equipment.Stick;
import StructuralPatterns.DecoratorPattern.Classes.Equipment.Sword;
import StructuralPatterns.DecoratorPattern.Classes.NormalMan;


public class DecoratorStarter{
    public void start()
    {
        Component man = new NormalMan();
        Component dogMan = new DogMan();
        man.attack();
        dogMan.attack();
        System.out.println("血量展示：人："+man.getHealth()+";狗:"+dogMan.getHealth());
        System.out.println("======================");
        System.out.println("普通人捡起来一根木棍");
        Equipment s = new Stick();
        s.setMan(man);
        s.attack();
        System.out.println("狗人捡起来一把宝剑");
        Equipment sword = new Sword();
        sword.setMan(dogMan);
        sword.attack();
        System.out.println("血量展示：人："+s.getHealth()+";狗:"+sword.getHealth());
    }


}
