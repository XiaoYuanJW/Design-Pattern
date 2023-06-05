import context.Context;
import strategy.OperationAdd;
import strategy.OperationMul;
import strategy.OperationSub;

public class Main {
    public static void main(String[] args) {

        OperationAdd operationAdd = new OperationAdd();
        OperationSub operationSub = new OperationSub();
        OperationMul operationMul = new OperationMul();

        Context context = new Context(operationAdd);
        System.out.println("Add：" + context.executeStrategy(10, 5));

        context.setStrategy(operationSub);
        System.out.println("Sub：" + context.executeStrategy(10, 5));

        context.setStrategy(operationMul);
        System.out.println("Mul：" + context.executeStrategy(10, 5));
    }
}