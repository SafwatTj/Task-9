import java.util.Comparator;

public class ComparatorPersonByWeight implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getWeight(),o2.getWeight());
    }
}
