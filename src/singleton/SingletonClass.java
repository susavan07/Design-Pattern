package singleton;

public class SingletonClass {


    private static SingletonClass singletonInstance = new SingletonClass();

    private SingletonClass(){

    }

    //Get the only object available
    public static SingletonClass getInstance(){
        return singletonInstance;
    }

    public void simpleMethod() {
        System.out.println("hashcode of singelton object" + singletonInstance);
    }

}