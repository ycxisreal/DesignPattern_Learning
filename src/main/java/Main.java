import BehavioralPatterns.StrategyPattern.StrategyStarter;
import CreationalPatterns.FactoryPattern.FactoryStarter;

public class Main {
    public static void main(String[] args) {
//        FactoryStarter f = new FactoryStarter();
//        f.Start();
        StrategyStarter strategyStarter = new StrategyStarter();
        strategyStarter.Start();
    }
}
