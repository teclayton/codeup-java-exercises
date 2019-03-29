import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        Person[] people = new Person[3];

        Person p1 = new Person("John");
        Person p2 = new Person("Thomas");
        Person p3 = new Person("Shelby");

        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

        for (Person p : people){
            System.out.println(p.name);
        }

        System.out.println();
        Person[] morePeople = addPerson(people, new Person("Someone"));
        for (Person person : morePeople){
            System.out.println(person.name);
        }



    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] newPeople;
        newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[newPeople.length -1] = person;
        return newPeople;
    }
}
