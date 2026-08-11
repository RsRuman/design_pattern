/**
 * Construct object step by step
 * good to use when have lots of optional parameter
 *
 */
public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                .name("Roman")
                .build();

        System.out.println(user.name);
        System.out.println(user.email);
    }
}