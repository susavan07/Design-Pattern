package singleton;

import singleton.SingletonClass;

public class MainClass {
    public static void main(String[] args) {
        SingletonClass singeltonObject = SingletonClass.getInstance();
        singeltonObject.simpleMethod();

        SingletonClass singeltonObject2 = SingletonClass.getInstance();
        singeltonObject2.simpleMethod();


    }

}