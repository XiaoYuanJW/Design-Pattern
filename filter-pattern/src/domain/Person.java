package domain;

import enums.GenderEnum;
import enums.MaritalEnum;

/**
 * Person
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private GenderEnum gender;
    /**
     * 是否已婚
     */
    private MaritalEnum maritalEnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public MaritalEnum getMaritalEnum() {
        return maritalEnum;
    }

    public void setMaritalEnum(MaritalEnum maritalEnum) {
        this.maritalEnum = maritalEnum;
    }

    public Person(String name, GenderEnum gender, MaritalEnum maritalEnum) {
        this.name = name;
        this.gender = gender;
        this.maritalEnum = maritalEnum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", maritalEnum=" + maritalEnum +
                '}';
    }
}
