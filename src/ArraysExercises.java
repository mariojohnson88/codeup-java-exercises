import java.util.Arrays;

public class ArraysExercises {


        public static Person[] addperson(Person[] people, Person newPerson){
            Person[] newGroup = Arrays.copyOf(people, people.length + 1);
            newGroup[newGroup.length - 1] = newPerson;
            return newGroup;
        }


    public static void main(String[] args) {

//        Question 1
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] person = new Person[3];
        person[0] = new Person("Mario");
        person[1] = new Person("Chloe");
        person[2] = new Person("Oliver");

        for(Person character: person) {
            System.out.println(character.getName());
        }
    }
}
