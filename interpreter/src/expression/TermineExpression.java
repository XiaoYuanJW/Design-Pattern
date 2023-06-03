package expression;

/**
 * TermineExpression    【终端符表达式】
 *
 * @author YuanJW
 * @date 2023/06/03
 */
public class TermineExpression implements Expression {

    private String data;

    public TermineExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.equals(data);
    }
}
