package factory;

import service.ProductA;
import service.ProductB;

/**
 * AbstractFactory
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public abstract class AbstractFactory {

    abstract ProductA createProductA();

    abstract ProductB createProductB();
}
