/**
 * Proxy design pattern is structural design pattern
 * where you create an object that stand infront of another object
 * and controls access to it
 */
public class Main {
    public static void main(String[] args) {
        VideoServiceProxy videoServiceProxy = new VideoServiceProxy("ADMIN");
        videoServiceProxy.play("Avatar");
    }
}