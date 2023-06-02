package service;

import domain.Person;

import java.util.List;

/**
 * AbstractCriteria
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public abstract class AbstractCriteria implements Criteria {
    protected List<Criteria> criterias;

    protected AbstractCriteria(List<Criteria> criterias) {
        this.criterias = criterias;
    }

    public abstract List<Person> criteria(List<Person> persons);
}
