package pl.bae.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");

        //Wygodniejsze od tablic

        stringList.size();
        stringList.isEmpty();
        //stringList.remove(2);
        stringList.get(2);

        Person person = new Person("Jan", "Kowalski", 22);
        Person person2 = new Person("Staś", "Lski", 2);

        List<Person> personList = new ArrayList<Person>();
        personList.add(person);
        personList.add(person2);

        for (Person p : personList) {
            System.out.println(p.getName());
        }
    }
}
