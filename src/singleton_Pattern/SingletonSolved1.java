package singleton_Pattern;

public class SingletonSolved1 {

    private static SingletonSolved1 uniqueInstance = new SingletonSolved1();
    private SingletonSolved1() {

    }

    public static SingletonSolved1 getInstance(){
        return uniqueInstance;
    }
}
