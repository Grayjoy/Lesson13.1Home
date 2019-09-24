import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(fullFio());
        System.out.println(briefFio());
        System.out.println(numberOfYears());
        System.out.println(arrays());
    }

    public static String fullFio() {
        Person person = new Person("Yarov", "Danylo", "Andrew");
        return person.getSurName() + " " + person.getName() + " " + person.getMiddleName();
    }

    public static String briefFio() {
        Person person = new Person("Yarov", "Danylo ", "Andrew");
        return person.getSurName() + " " + person.getName().charAt(0) + "." + person.getMiddleName().charAt(0) + ".";
    }

    public static int numberOfYears() {
        Person person = new Person("Yarov ", "Danylo ", "Andrew", 25, 12, 1996);
        LocalDate birthDate = LocalDate.of(person.getYears(), person.getMonth(), person.getDay());
        LocalDate currentDate = LocalDate.of(2019, 9, 24);

        return Period.between(birthDate, currentDate).getYears();
    }

    public static ArrayList<Person> arrays() {
        Person person = new Person("Yarov ", "Danylo ", "Andrew");
        Person person1 = new Person("Bor ", "Maks ", "Andrew");
        Person person2 = new Person("Lor ", "Alex ", "Andrew");

        ArrayList<Person> array = new ArrayList<>();
        array.add(person);
        array.add(person1);
        array.add(person2);

        Collections.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return array;
    }
}


