package template_Pattern;

public class Coffee {

    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourIncup();
        addSugarAndMilk();
    }



    private void boilWater() {

        System.out.println("물긇이는 중");
    }

    private void brewCoffeeGrinds() {
        System.out.println("필터로 커피 우려내는 중");
    }
    private void pourIncup() {
        System.out.println("컵에 따르는 중");
    }

    private void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가하는 중 ");
    }

}
