package homework5and6;

public interface Music {

    //Constant variables
    String NAME = "MUSIC"; //no need to specify public static final

    //abstract methods
    void playMusic(); // no need to specify public abstract

    void pauseMusic();

    void stopMusic();

    //default methods - normal methods
    default void sayHello() {
        System.out.println("Hello from music");
    }

    //static methods
    static String getName() {
        privateMethod();
        return NAME;
    }

    //private static methods - can be called from any place in interface
    private static void privateMethod() {
        System.out.println("Hello from private method");
    }

}
