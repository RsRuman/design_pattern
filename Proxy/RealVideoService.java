public class RealVideoService implements VideoService {
    @Override
    public void play(String name) {
        System.out.println("Playing:" + name);
    }
}