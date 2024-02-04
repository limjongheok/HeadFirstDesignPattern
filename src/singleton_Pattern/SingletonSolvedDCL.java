package singleton_Pattern;

public class SingletonSolvedDCL {

    private volatile  static SingletonSolvedDCL uniqueInstance;
    private SingletonSolvedDCL() {

    }

    public static SingletonSolvedDCL getUniqueInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonSolvedDCL.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonSolvedDCL();
                }
            }
        }
        return uniqueInstance;
    }
}
