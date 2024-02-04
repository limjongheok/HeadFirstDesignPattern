package factory_Pattern.factory2;

import java.util.ArrayList;
import java.util.List;

public abstract class Order {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}

class NYPizzaOrder extends Order{

    @Override
    Pizza createPizza(String item) {
        Pizza pizza =null;
        if(item.equals("cheese")){
            pizza =  new NYStyleCheesePizza();
        }

        return pizza;
    }
}
class ChicagoOrder extends Order{

    @Override
    Pizza createPizza(String item) {
        Pizza pizza =null;
        if(item.equals("cheese")){
            pizza =  new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}

abstract class Pizza{
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("준비중 :" +name);
        System.out.println("도우를 돌리는 중....");
        System.out.println("소스를 뿌리는중....");
        System.out.println("토핑을 올리는 중....");
        for(String topping : toppings){
            System.out.println(" " + topping);
        }
    }

    void bake(){
        System.out.println("175도 25분 굽기 ");
    }

    void cut(){
        System.out.println("자르기 ");
    }
    void box(){
        System.out.println("상자에 담기  ");
    }

    public String getName(){
        return name;
    }

}

class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza(){
        name = "뉴욕 스타일 소스와 치즈 피자";
        dough = "신 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 레지아노 치즈 ");
    }
}

class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "시카고  스타일 딥 디쉬 치즈  피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("잘게 썬 레지아노 치즈 ");
    }

    @Override
    void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}

 class PizzaTestDrive{
    public static void main(String[] args){

        Order order = new NYPizzaOrder();
        Order order1 = new ChicagoOrder();

        Pizza pizza = order.orderPizza("cheese");
        System.out.println("에딘이 주문한" + pizza.getName());

        pizza = order1.orderPizza("cheese");
        System.out.println("조엘이 주문한 피자 " +pizza.getName());
    }

}