import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>( List.of(
                new Person(1,"Jack","Johnson",34,186,92.2),
                new Person(2,"Nick","Davis",37,177,100),
                new Person(3,"Lena","Simpson",23,166,57.3),
                new Person(4,"Ann","Johnson",26,170,92.2),
                new Person(4,"Ann","Annava",26,170,92.2),
                new Person(5,"Bruce","Lee",33,153,71.6),
                new Person(6,"Olga","Vatter",42,166,72.1),
                new Person(6,"Olga","Vatter",42,166,72.1),
                new Person(3,"Boris","Johnson",26,170,92.2)
        ));

        print(personList);
        personList.sort(new ComparatorPersonByAge());
        System.out.println("------------ sort By Age --------------- ");
        print(personList);
        System.out.println("------------ sort By Id --------------- ");
        personList.sort(new ComparatorPersonById());
        print(personList);
        System.out.println("------------ sort By LastName --------------- ");
        personList.sort(new ComparatorPersonByLastName());
        print(personList);
        System.out.println("------------ sort By LastName and FirstName --------------- ");
        personList.sort(new ComparatorPersonByLastName().thenComparing(new ComparatorPersonByFirstName()));
        print(personList);
        System.out.println("------------ sort By Weight --------------- ");
        personList.sort(new ComparatorPersonByWeight().reversed());
        print(personList);

        System.out.println("------------ sort By Age and By Id and By Name --------------- ");
        personList.sort( new ComparatorPersonByAge().thenComparing(new ComparatorPersonById()).thenComparing(new ComparatorPersonByLastName())      );
        print(personList);


        /*
            personList.sort((p1,p2) -> p1.getId()-p2.getId());
         */


    }
    public static void print(List<Person> list){
        for (Person person:list){
            System.out.println(person);
        }
    }
}
