package code.java.design.pattern.creational.singleton.sample08;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    // better approach instead of above 
    protected Object readResolve() {
        return getInstance();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
}
