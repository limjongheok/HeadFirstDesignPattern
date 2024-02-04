package strategy_Pattern.pattern;



public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날다");
    }
}
