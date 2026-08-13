/**
 * Decorator design pattern is a structural design pattern
 * which help to add dynamic behaviour to an existing object without directly modifying it
 */
public class Main {
    public static void main(String[] args) {

        Cofee cofeeAndMilk = new MilkDecorator(new SugerDecorator(new SimpleCofee()));

        System.out.println("Item: " + cofeeAndMilk.description());
        System.out.println("Price: " + cofeeAndMilk.charge());
    }
}