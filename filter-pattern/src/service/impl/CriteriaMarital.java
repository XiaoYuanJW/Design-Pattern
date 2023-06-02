package service.impl;

import domain.Person;
import enums.MaritalEnum;
import service.Criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * CriteriaMarital
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class CriteriaMarital implements Criteria {
    private MaritalEnum marital;

    public CriteriaMarital(MaritalEnum marital) {
        this.marital = marital;
    }

    @Override
    public List<Person> criteria(List<Person> persons) {
        return persons.stream()
                .filter(person -> marital.equals(person.getMaritalEnum()))
                .collect(Collectors.toList());
    }
}
