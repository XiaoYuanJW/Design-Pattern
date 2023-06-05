package strategy;

/**
 * OperationAdd
 *
 * @author YuanJW
 * @date 2023/06/05
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
