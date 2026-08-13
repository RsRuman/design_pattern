public class MilkDecorator extends CofeeDecorator {
    public MilkDecorator(Cofee cofee) {
        super(cofee);
    }

    @Override
    public String description() {
        return cofee.description() +", Milk";
    }

    @Override
    public double charge() {
        return cofee.charge() + 15.5;
    }
}