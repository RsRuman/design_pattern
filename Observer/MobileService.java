public class MobileService implements Observer {
    @Override
    public void update(double temperature) {
        System.out.println("Current temperature: " + temperature);
    }
}