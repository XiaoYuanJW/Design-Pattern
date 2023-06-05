package factory;

import service.ConcreteProductA1;
import service.ConcreteProductB1;
import service.ProductA;
import service.ProductB;

/**
 * ConcreteFactory1
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
