package factory;

import service.ConcreteProductA2;
import service.ConcreteProductB2;
import service.ProductA;
import service.ProductB;

/**
 * ConcreteFactory2
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

