import domain.Person;
import enums.GenderEnum;
import enums.MaritalEnum;
import service.*;
import service.impl.CriteriaGender;
import service.impl.CriteriaMarital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", GenderEnum.MALE, MaritalEnum.SINGLE));
        persons.add(new Person("John",GenderEnum.MALE, MaritalEnum.MARRIED));
        persons.add(new Person("Laura",GenderEnum.MALE, MaritalEnum.SINGLE));
        persons.add(new Person("Diana",GenderEnum.FEMALE, MaritalEnum.MARRIED));
        persons.add(new Person("Mike",GenderEnum.FEMALE, MaritalEnum.SINGLE));
        persons.add(new Person("Bobby",GenderEnum.FEMALE, MaritalEnum.MARRIED));

        List<Criteria> criterias = Arrays.asList(
                new CriteriaGender(GenderEnum.FEMALE),
                new CriteriaMarital(MaritalEnum.SINGLE)
        );

        System.out.println("--FEMALE AND SINGLE--");
        AndCriteria andCriteria = new AndCriteria(criterias);
        andCriteria.criteria(persons).stream()
                .map(Person::toString)
                .forEach(System.out::println);

        System.out.println("--FEMALE OR SINGLE--");
        OrCriteria orCriteria = new OrCriteria(criterias);
        orCriteria.criteria(persons).stream()
                .map(Person::toString)
                .forEach(System.out::println);

    }
}