import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
    String firstName;
    String lastName;
    int age;

    @Override
    public int compareTo(Person other){
        return this.lastName.compareTo(other.lastName);
    }


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }


    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("SpongeBob", "SquarePants", 35));
        myFamily.add(new Person("Patrick", "Star", 30));
        myFamily.add(new Person("Squidward", "Tentacles", 40));
        myFamily.add(new Person("Eugine", "Krabs", 64));
        myFamily.add(new Person("Sandy", "Cheeks", 33));

        Collections.sort(myFamily);

        for (Person p : myFamily){
            System.out.println(p.firstName + ", " + p.lastName + ", " + p.age);
        }

    }

}