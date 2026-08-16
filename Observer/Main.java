/**
 * Observer design pattern is a behavioural design pattern where
 * one object maintain a list of other objects and automatically notify them when its state changes
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        DashboardService dashboardService = new DashboardService();
        MobileService mobileService = new MobileService();

        weatherStation.addObserver(dashboardService);
        weatherStation.addObserver(mobileService);

        weatherStation.setTemperature(45);
    }
}