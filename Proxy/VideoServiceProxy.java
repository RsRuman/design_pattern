public class VideoServiceProxy implements VideoService {
    private RealVideoService realVideoService;
    private String role;

    public VideoServiceProxy(String role) {
        this.role = role;
    }

    @Override
    public void play(String name) {
        if (!role.equalsIgnoreCase("admin")) {
            System.out.println("Access Denied");
            return;
        }

        if (realVideoService == null) {
            realVideoService = new RealVideoService();
        }

        realVideoService.play(name);
    }
}