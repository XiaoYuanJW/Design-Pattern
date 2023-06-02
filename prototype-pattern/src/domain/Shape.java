package domain;

import enums.ShapeEnum;

/**
 * domain.Shape 实现【Cloneable】接口的抽象类
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public abstract class Shape implements Cloneable {
    /**
     * 类型
     */
    protected ShapeEnum type;

    /**
     * 公用抽象方法
     */
    public abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            // 浅拷贝
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public ShapeEnum getType() {
        return type;
    }
}
