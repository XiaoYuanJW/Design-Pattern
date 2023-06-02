package service;

import domain.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * OrCriteria
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class OrCriteria extends AbstractCriteria {

    public OrCriteria(List<Criteria> criterias) {
        super(criterias);
    }

    @Override
    public List<Person> criteria(List<Person> persons) {
        List<Person> personList = new ArrayList<>(persons.size());
        Iterator<Criteria> iterator = criterias.iterator();
        while (iterator.hasNext()) {
            Criteria next = iterator.next();
            personList.addAll(next.criteria(persons));
        }
        return personList.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
