package strategy_Pattern.pattern;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {
    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    } // 행동 클래스에 위임

    public void performQuack(){
        quackBehavior.quack();;
    }

    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다.");
    }


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
