package creational.singleton.example1;

public class Singleton {
   
    private static Singleton instance;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public void connect(){
        System.out.println("Connect");
    }
    
    public void close(){
        System.out.println("Close");
    }
    
}
