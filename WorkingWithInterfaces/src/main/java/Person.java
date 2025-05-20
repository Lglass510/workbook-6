

public class Person implements Comparable<Person> {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other){
        int lastNameCompare = this.lastName.compareToIgnoreCase(other.lastName);
        if (lastNameCompare != 0) return lastNameCompare;

        int firstNameCompare = this.firstName.compareToIgnoreCase(other.firstName);
        if (firstNameCompare != 0) return firstNameCompare;

        return Integer.compare(this.age, other.age);
    }



}