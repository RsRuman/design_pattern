/**
 * Cofee decorator contains another Cofee object
 */
public abstract class CofeeDecorator implements Cofee {
    protected Cofee cofee;

    public CofeeDecorator(Cofee cofee) {
        this.cofee = cofee;
    }
}