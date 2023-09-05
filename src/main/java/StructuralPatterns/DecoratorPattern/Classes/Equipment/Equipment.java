package StructuralPatterns.DecoratorPattern.Classes.Equipment;

import StructuralPatterns.DecoratorPattern.Classes.Component;

public abstract class Equipment implements Component {
    protected Component man;
    protected int addHealth = 0;

    @Override
    public int getHealth() {
        return 0;
    }

    public void setMan(Component man) {
        this.man = man;
    }

    public void attack(){
        if (man !=null)
            man.attack();
    }
}
