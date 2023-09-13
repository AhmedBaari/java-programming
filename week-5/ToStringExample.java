public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
public class ToStringExample {
    public static void main(String[] args) {
        Person person1 = new Person("Baari", 18);
        Person person2 = new Person("Ahmed", 19);

        // Using the toString() method to get a string representation
        String person1String = person1.toString();
        String person2String = person2.toString();

        System.out.println("Person 1: " + person1String);
        System.out.println("Person 2: " + person2String);
    }
}
