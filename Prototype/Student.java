public class Student implements Prototype {
    private String id;
    private String firstName;
    private String lastName;
    public Address address;

    public Student(String id, String firstName, String lastName, Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    // Deep copy
    public Student clone() {
        Address newAddress = new Address(this.address.city);
        return new Student(this.id, this.firstName, this.lastName, newAddress);
    }

    // Shallow copy
//    public Student clone() {
//        return new Student(this.id, this.firstName, this.lastName, this.address);
//    }

    public String toString() {
        return "Id: " + this.id + " FirstName: " + this.firstName + " LastName: " + this.lastName + " Address: " + this.address.city;
    }
}