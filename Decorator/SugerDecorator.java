public class SugerDecorator extends CofeeDecorator {
    public SugerDecorator(Cofee cofee) {
        super(cofee);
    }

    @Override
    public String description() {
        return cofee.description() + ", Suger";
    }

    public double charge() {
        return cofee.charge() + 10;
    }
}