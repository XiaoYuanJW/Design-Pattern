package service.impl;

import domain.Person;
import enums.GenderEnum;
import service.Criteria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * CriteriaGender
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class CriteriaGender implements Criteria {
    private GenderEnum gender;

    public CriteriaGender(GenderEnum gender) {
        this.gender = gender;
    }

    @Override
    public List<Person> criteria(List<Person> persons) {
        return persons.stream()
                .filter(person -> gender.equals(person.getGender()))
                .collect(Collectors.toList());
    }
}
