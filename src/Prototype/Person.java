package Prototype;

public class Person implements Human {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+firstName+" "+lastName+"\n"
                +"Age: "+age;
    }

    @Override
    public Human clone() {
        Person person = null;
        try{
            person = (Person) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return person;
    }
}
