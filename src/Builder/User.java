package Builder;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;

    public User(UserBuilder UserBuilder){
        this.address = UserBuilder.address;
        this.age = UserBuilder.age;
        this.firstName = UserBuilder.firstName;
        this.lastName = UserBuilder.lastName;
        this.phoneNumber = UserBuilder.phoneNumber;
    }

    @Override
    public String toString(){
        return "Name: "+firstName+" "+lastName+"\n"+
                "PhoneNumber: "+phoneNumber+"\n"+
                "Address: "+address;

    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private String phoneNumber;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
