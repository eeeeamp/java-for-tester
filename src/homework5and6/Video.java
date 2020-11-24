package homework5and6;

public interface Video {

    void playVideo();

    void pauseVideo();

    void stopVideo();

    default void sayHello() {
        System.out.println("Hello from video!");
    }
}
