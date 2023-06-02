package service;

import domain.Person;

import java.util.List;

/**
 * Criteria
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public interface Criteria {
    /**
     * 过滤
     *
     * @param persons
     * @return
     */
    List<Person> criteria(List<Person> persons);
}
