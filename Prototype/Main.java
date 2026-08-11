/**
 * Create object by copying opject
 * Simulate expensive operation
 */
public class Main {
    public static void main(String[] args) {

        Address address = new Address("Berlin");

        Student student1 = new Student("01", "Rs",  "Roman", address);
        Student student2 = student1.clone();
        student2.address.city = "Dhaka";

        System.out.println(student1.toString());;
        System.out.println(student2.toString());;
    }
}