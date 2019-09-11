import java.time.LocalDate;
import java.util.ArrayList;
import search.Person;

public class program {
    public static void main(String[] args) {
        String searchString;

        if (args.length > 0) {
            searchString = args[0];

            ArrayList<Person> persons = new ArrayList<Person>();

            Person person1 = new Person();
            Person person2 = new Person("Tycho", "Brahe");
            Person person3 = new Person("Nicolaus", "Copernicus", LocalDate.of(1473, 2, 19));
            Person person4 = new Person("Isaac", "Newton", LocalDate.of(1643, 1, 4), "5551234567");
            Person person5 = new Person("Gottfried", "Leibniz", LocalDate.of(1646, 6, 1));
            Person person6 = new Person("Friedrich", "Nietzsche", LocalDate.of(1844, 10, 15), "5555555555");
            Person person7 = new Person("Jane", "Doe");
            persons.add(person1);
            persons.add(person2);
            persons.add(person3);
            persons.add(person4);
            persons.add(person5);
            persons.add(person6);
            persons.add(person7);

            System.out.println("====== Matches ======");
            for (int i = 0; i < persons.size(); i++) {
                if (persons.get(i).fullName.toLowerCase().contains(searchString.toLowerCase())) {
                    System.out.println(createInfo(persons.get(i)));
                }
            }

        } else {
            System.out.println("You need to provide an argument (the search term) to the program");
        }
    }

    public static String createInfo(Person person) {
        String infoString = "";
        infoString += person.fullName + "\n";
        infoString += person.getDob() + "\n";
        infoString += person.getTelephoneNumber() + "\n";
        infoString += "=====================";
        return infoString;
    }
}