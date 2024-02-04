package strategy_Pattern.abstractDuck;

public class Duck {

    public void quack(){
        System.out.println("꽥");
    }
    public void swim(){
        System.out.println("수영");
    }

    public void display(){
        System.out.println("디스플레이");
    }

    public void fly(){
        System.out.println("날다"); // 나는 기능 추가
    }
}
