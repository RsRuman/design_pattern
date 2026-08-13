public class SimpleCofee implements Cofee {

    @Override
    public String description() {
        return "Simple Cofee";
    }

    @Override
    public double charge() {
        return 20.5;
    }
}