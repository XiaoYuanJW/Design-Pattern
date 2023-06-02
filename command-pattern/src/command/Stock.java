package command;

/**
 * Stock
 *
 * @author YuanJW
 * @date 2023/06/02
 */
public class Stock {
    private String name = "TEST";

    private int quantity = 10;

    public void buy() {
        System.out.println(
                String.format("Stock [ Name: %s, Quantity: %d ] bought", name, quantity)
        );
    }

    public void sell() {
        System.out.println(
                String.format("Stock [ Name: %s, Quantity: %d ] sold", name, quantity)
        );
    }
}
