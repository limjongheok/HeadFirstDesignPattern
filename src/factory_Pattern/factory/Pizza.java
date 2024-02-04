package factory_Pattern.factory;

public class Pizza {

    public void prepare(){
        System.out.println("준비하다");
    }
    public void bake(){
        System.out.println("굽다");
    }
    public void cut(){
        System.out.println("자르다");
    }
    public void box(){
        System.out.println("포장하다");
    }

}

class CheesePizza extends Pizza{



}
class PepperoniPizza extends Pizza{

}
class Order{

    private SimplePizzaFactory factory;

    public Order(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
//        if(type.equals("cheese")){
//            pizza = new CheesePizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        } => 변하는 부분 분리
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

class SimplePizzaFactory{
    public Pizza createPizza(String type){
        Pizza pizza = null;
       if(type.equals("cheese")){
          pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
          pizza = new PepperoniPizza();
        }
       return  pizza;
    }
}


class Main{
    public static void main(String[] args){
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        Order order = new Order(simplePizzaFactory);
        order.orderPizza("cheese");
    }
}