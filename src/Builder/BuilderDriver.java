package Builder;

public class BuilderDriver {
    public static void main(String[] args) {
        User user = new User.UserBuilder("harsha", "vardhan")
                .age(20)
                .phoneNumber("9876543210")
                .address("earth")
                .build();

        System.out.println(user);
    }
}
