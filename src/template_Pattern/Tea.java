package template_Pattern;

public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourIncup();
        addLemon();
    }


    private void boilWater() {

        System.out.println("물긇이는 중");
    }

    private void steepTeaBag() {
        System.out.println("찻잎 우려는중");
    } // 홍차 정용 메서드
    private void addLemon() {
        System.out.println("레몬을 추가하는 중 ");
    } // 홍차 전용메서드
    private void pourIncup() {
        System.out.println("컵에 따르는 중");
    }



}
