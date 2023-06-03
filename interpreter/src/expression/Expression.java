package expression;

/**
 * Expression 【表达式接口】
 *
 * @author YuanJW
 * @date 2023/06/03
 */
public interface Expression {
    /**
     * 解释
     *
     * @param context
     * @return
     */
    boolean interpret(String context);
}
