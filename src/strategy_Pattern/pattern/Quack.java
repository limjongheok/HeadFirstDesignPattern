package strategy_Pattern.pattern;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
