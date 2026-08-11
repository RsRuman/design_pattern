/**
 * Client doesn't know which concreate classes are created
 */
public class Client {
    private final Button button;
    private final Checkbox checkbox;

    public Client(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

}