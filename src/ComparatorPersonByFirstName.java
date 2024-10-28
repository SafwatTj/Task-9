import java.util.Comparator;

public class ComparatorPersonByFirstName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getfName().compareTo(o2.getfName());
    }
}
