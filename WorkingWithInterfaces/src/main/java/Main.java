import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> myFamily = new ArrayList<>();
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
