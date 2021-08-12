package categories.creational.Singleton;

public class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();
    public static int counter;

    private SingletonEager() {
        System.out.println("SingletonEager ==> in the constructor"); // this will print first
        counter++;
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
    
    public void print() {
        System.out.println("SingletonEager ==> hello from eager");
    }
    
    public static void main(String[] args) {
        System.out.println("SingletonEager ==> main method start");
        
        SingletonEager.getInstance().print();;
        
        System.out.println("SingletonEager ==> main end");
    }

}