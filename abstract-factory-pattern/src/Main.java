import factory.ConcreteFactory1;
import factory.ConcreteFactory2;
import service.ProductA;
import service.ProductB;

/**
 * 抽象工厂模式
 */
public class Main {
    public static void main(String[] args) {

        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ProductA productA1 = concreteFactory1.createProductA();
        ProductB productB1 = concreteFactory1.createProductB();
        productA1.doSomething();
        productB1.doSomething();

        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        ProductA productA2 = concreteFactory2.createProductA();
        ProductB productB2 = concreteFactory2.createProductB();
        productA2.doSomething();
        productB2.doSomething();
    }
}