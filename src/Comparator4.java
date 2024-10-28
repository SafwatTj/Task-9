import java.util.Comparator;

public class ComparatorPersonByLastName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getlName().compareTo(o2.getlName());
    }
}
