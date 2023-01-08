package ObjectsAndClasses.OpinionPolls;

public class Person {
    //fields -> describe characteristics
    private final String name;
    private final int age;

    //constructor -> used to create objects from the class of the same name
    public Person(String name, int age) {
        // new object
        this.name = name;
        this.age = age;
    }

    //getter -> a method via which we access the values of a field
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
