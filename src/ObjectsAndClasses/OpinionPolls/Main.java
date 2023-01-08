package ObjectsAndClasses.OpinionPolls;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String data = sc.nextLine(); //{name} {age{
            String name = data.split(" ")[0];
            int age = Integer.parseInt(data.split(" ")[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                personList.add(person);
            }
        }
        for (Person person : personList) {
            // {name} {age}
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
