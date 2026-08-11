/**
 * Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 */
public class Main {
    public static void main(String[] args) {

        GuiFactory factory;
        String os = "mac";

        if (os.equalsIgnoreCase("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Client client = new Client(factory);

        client.renderUI();
    }
}