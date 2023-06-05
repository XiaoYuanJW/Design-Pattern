package template;

/**
 * SecondTemplate   【具体子类-实现抽象模版方法】
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class SecondTemplate extends Template {

    @Override
    void step1() {
        System.out.println("Second step1");
    }

    @Override
    void step2() {
        System.out.println("Second step2");
    }

    @Override
    void step3() {
        System.out.println("Second step3");
    }
}
