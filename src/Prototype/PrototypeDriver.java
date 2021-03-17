package Prototype;

public class PrototypeDriver {
    public static void main(String[] args) {
        Person person = new Person("harsha", "vardhan", 20);
        Person person1 = (Person)person.clone();
        System.out.println(person);
        System.out.println(person.hashCode());
        System.out.println(person1);
        System.out.println(person1.hashCode());
    }
}
