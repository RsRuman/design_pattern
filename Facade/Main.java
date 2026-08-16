/**
 * Facade provide simple interface to implement complex system
 */
public class Main {
    public static void main(String[] args) {

        // Hiding complexity how computer will start
        // You can still do create object of other classes and call sequentially their behaviour
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}