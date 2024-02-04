package template_Pattern.hook;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    private void boilWater() {

        System.out.println("물끓이는중 ");
    }
    private void pourInCup() {
        System.out.println("컵에 따르는 중 ");
    }

    boolean customerWantsCondiments(){ // 후크
        return true;
    }
}
