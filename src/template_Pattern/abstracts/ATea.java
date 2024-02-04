package template_Pattern.abstracts;

public class ATea extends  CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("찻잎 우리는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}
