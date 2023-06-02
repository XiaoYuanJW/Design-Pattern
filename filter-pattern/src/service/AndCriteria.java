package service;

import domain.Person;

import java.util.Iterator;
import java.util.List;

/**
 * AndCriteria
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class AndCriteria extends AbstractCriteria {

    public AndCriteria(List<Criteria> criterias) {
        super(criterias);
    }

    @Override
    public List<Person> criteria(List<Person> persons) {
        Iterator<Criteria> iterator = criterias.iterator();
        while (iterator.hasNext()) {
            Criteria next = iterator.next();
            persons = next.criteria(persons);
        }
        return persons;
    }
}
