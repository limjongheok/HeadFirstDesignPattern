package template_Pattern.abstracts;

public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();

    private void boilWater() {

        System.out.println("물끓이는중 ");
    }
    private void pourInCup() {
        System.out.println("컵에 따르는 중 ");
    }




}
