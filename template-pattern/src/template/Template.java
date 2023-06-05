package template;

/**
 * Template 【模版抽象类】
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public abstract class Template {
    /**
     * 【定义模版方法-包含 一系列固定的步骤 具体步骤的实现由子类提供】
     * 通过这种方方式，模版模式提供一个中结构话的方法实现一系列具体有相似流程的操作
     * 注：为防止恶意操作，一般模板方法都加上 final 关键词
     */
    public final void templateMethod() {
        step1();
        step2();
        step3();
    }

    abstract void step1();

    abstract void step2();

    abstract void step3();
}
